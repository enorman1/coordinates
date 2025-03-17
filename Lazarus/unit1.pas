unit Unit1;

{$mode objfpc}{$H+}

interface

uses
  Classes, SysUtils, FileUtil, Forms, Controls, Graphics, Dialogs, StdCtrls,
  ExtCtrls, Math;

type

  { TForm1 }

  TForm1 = class(TForm)
    CheckBox1: TCheckBox;
    CheckBox2: TCheckBox;
    CheckBox3: TCheckBox;
    Edit1: TEdit;
    Edit2: TEdit;
    Edit3: TEdit;
    Edit4: TEdit;
    Edit5: TEdit;
    Edit6: TEdit;
    Label1: TLabel;
    Label10: TLabel;
    Label13: TLabel;
    Label14: TLabel;
    Label2: TLabel;
    Label3: TLabel;
    Label4: TLabel;
    Label5: TLabel;
    Label6: TLabel;
    Label7: TLabel;
    Label8: TLabel;
    Label9: TLabel;
    Shape1: TShape;
    procedure Edit1Exit(Sender: TObject);
    procedure Edit1KeyPress(Sender: TObject; var Key: char);
    procedure Edit2Exit(Sender: TObject);
    procedure Edit2KeyPress(Sender: TObject; var Key: char);
    procedure Edit3Exit(Sender: TObject);
    procedure Edit3KeyPress(Sender: TObject; var Key: char);
    procedure Edit4Exit(Sender: TObject);
    procedure Edit4KeyPress(Sender: TObject; var Key: char);
    procedure Edit5Exit(Sender: TObject);
    procedure Edit5KeyPress(Sender: TObject; var Key: char);
    procedure Edit6Exit(Sender: TObject);
    procedure Edit6KeyPress(Sender: TObject; var Key: char);
    procedure FormCreate(Sender: TObject);
    procedure FormKeyPress(Sender: TObject; var Key: char);
    procedure UpdateCoord(var myEdit: TEdit);
  private
    { private declarations }
  public
    { public declarations }

  end;

var
  Form1: TForm1;

implementation

{$R *.lfm}

{ TForm1 }

function IsNumeric(teststr: String): Boolean;
var
  i: Double;
begin
  Result := TryStrToFloat(teststr,i);
end;

function CosDegree(angle: Double): Double;
const
  Pi = 3.1415926535897932384626433832795;
  SqRt2 = 1.4142135623730950488016887242097;
  SqRt3 = 1.7320508075688772935274463415059;
begin
  if angle >= 360 then
     angle := angle - (360 * Trunc(angle / 360.0));
  if angle <= -360 then
     angle := angle + (360 * Trunc(angle / -360.0));
  if angle < 0 then angle := angle + 360;

  // Valeurs remarquables du cosinus
  if angle = 0. then Result := 1
  else if angle = 30.0 then Result := SqRt3 / 2.
  else if angle = 45.0 then Result := SqRt2 / 2.
  else if angle = 60.0 then Result := 0.5
  else if angle = 90.0 then Result := 0
  else if angle = 120.0 then Result := -0.5
  else if angle = 135.0 then Result := -SqRt2 / 2.
  else if angle = 150.0 then Result := -SqRt3 / 2.
  else if angle = 180.0 then Result := -1
  else if angle = 210.0 then Result := -SqRt3 / 2.
  else if angle = 225.0 then Result := -SqRt2 / 2.
  else if angle = 240.0 then Result := -0.5
  else if angle = 270.0 then Result := 0
  else if angle = 300.0 then Result := 0.5
  else if angle = 315.0 then Result := SqRt2 / 2.
  else if angle = 330.0 then Result := SqRt3 / 2.
  else if angle = 360.0 then Result := 1
  else Result := Cos(angle * Pi / 180);
end;

function SinDegree(angle: Double): Double;
const
  Pi = 3.1415926535897932384626433832795;
  SqRt2 = 1.4142135623730950488016887242097;
  SqRt3 = 1.7320508075688772935274463415059;
begin
  if angle >= 360 then
     angle := angle - (360 * Trunc(angle / 360.0));
  if angle <= -360 then
     angle := angle + (360 * Trunc(angle / -360.0));
  if angle < 0 then angle := angle + 360;

  // Valeurs remarquables du sinus
  if angle = 0. then Result := 0
  else if angle = 30.0 then Result := 0.5
  else if angle = 45.0 then Result := SqRt2 / 2.
  else if angle = 60.0 then Result := SqRt3 / 2.
  else if angle = 90.0 then Result := 1
  else if angle = 120.0 then Result := SqRt3 / 2.
  else if angle = 135.0 then Result := SqRt2 / 2.
  else if angle = 150.0 then Result := 0.5
  else if angle = 180.0 then Result := 0
  else if angle = 210.0 then Result := -0.5
  else if angle = 225.0 then Result := -SqRt2 / 2.
  else if angle = 240.0 then Result := -SqRt3 / 2.
  else if angle = 270.0 then Result := -1
  else if angle = 300.0 then Result := -SqRt3 / 2.
  else if angle = 315.0 then Result := -SqRt2 / 2.
  else if angle = 330.0 then Result := -0.5
  else if angle = 360.0 then Result := 0
  else Result := Sin(angle * Pi / 180);

end;

function TextNumeric(var myEdit: TEdit; Key: char):char;
begin
  //WriteLn(myEdit.SelStart);
  //WriteLn(myEdit.SelLength);
  //WriteLn(Length(myEdit.Text));
  //WriteLn(myEdit.SelText);

  if Key = 'E' then Key := 'e';
  if Key = ',' then Key := '.';
  //if Key = #13 then Key := #9; //substitue Enter key by Tab key

  // Ctrl+X = 24 ; Ctrl+C = 3 ; Ctrl+V = 22 ; Enter = 13 ; Tab = 9 ; BackSp = 8
  if not (Key in ['0'..'9', '.', '-', 'e', #3, #8, #9, #13, #22, #24]) then
     Key := #0;

  if (Key = '-') then
  begin
    if Length(myEdit.Text) > 0 then
    begin
      if myEdit.SelStart > 0 then
      begin
        if not (0 = CompareStr(Copy(myEdit.Text, myEdit.SelStart, 1), 'e')) then
            Key := #0;
      end;
      if myEdit.SelStart < Length(myEdit.Text) then
      begin
        if (0 = CompareStr(Copy(myEdit.Text, myEdit.SelStart + 1, 1), '-')) then
            Key := #0;
      end;
    end;
  end;

  if (Key = 'e') then
  begin
    if Length(myEdit.Text) = 0 then Key := #0
    else
    begin
       //if not (IsNumeric(Copy(myEdit.Text, myEdit.SelStart, 1))) then
       if not (0 = Pos('e' , myEdit.Text)) then  // <> 0
       begin
         if not (0 = Pos('e' , myEdit.SelText)) then  // <> 0
         begin
           if not ((Copy(myEdit.Text, myEdit.SelStart, 1))[1]
              in ['0'..'9', '.']) then Key := #0;
         end
         else  // == 0
         begin
           Key := #0;
         end;
       end
       else   // == 0
       begin
         if not ((Copy(myEdit.Text, myEdit.SelStart, 1))[1]
            in ['0'..'9', '.']) then Key := #0;
       end;
    end;
  end;

  if (Key = '.') then
  begin
    if Length(myEdit.Text) = 0 then Key := #0
    else
    begin
      if not (0 = Pos('.' , myEdit.Text)) then  // <> 0
      begin
         if 0 = Pos('.' , myEdit.SelText) then Key := #0;  // == 0
      end
      else  // == 0
      begin
        if not (0 = Pos('e' , myEdit.Text)) then  // <> 0
        begin
          if myEdit.SelStart >= Pos('e' , myEdit.Text) then Key := #0;
        end;
      end;
    end;
  end;
  result := Key;
end;

procedure TForm1.Edit1KeyPress(Sender: TObject; var Key: char);
begin
  //WriteLn(Edit1.SelStart);
  //WriteLn('Edit1KeyPress');
  //WriteLn(Self.Text);
  //WriteLn(Ord(Key));
  //WriteLn(Edit1.SelStart);
  //myStr := Edit1.Text;
  Key := TextNumeric(Edit1, Key);
end;

procedure TForm1.Edit1Exit(Sender: TObject);
  Var myDouble: Double;
begin
  Edit1.Text := StringReplace(Edit1.Text, ',', '.', [rfReplaceAll, rfIgnoreCase]);
  if IsNumeric(Edit1.Text) then
  begin
     myDouble := StrToFloat(Edit1.Text);
     Edit1.Text := FloatToStr(myDouble);
  end
  else Edit1.Text := '0';
  UpdateCoord(Edit1);
end;

procedure TForm1.Edit2KeyPress(Sender: TObject; var Key: char);
begin
  Key := TextNumeric(Edit2, Key);
end;

procedure TForm1.Edit2Exit(Sender: TObject);
  Var myDouble: Double;
begin
  Edit2.Text := StringReplace(Edit2.Text, ',', '.', [rfReplaceAll, rfIgnoreCase]);
  if IsNumeric(Edit2.Text) then
  begin
     myDouble := StrToFloat(Edit2.Text);
     Edit2.Text := FloatToStr(myDouble);
  end
  else Edit2.Text := '0';
  UpdateCoord(Edit2);
end;

procedure TForm1.Edit3KeyPress(Sender: TObject; var Key: char);
begin
  Key := TextNumeric(Edit3, Key);
end;

procedure TForm1.Edit3Exit(Sender: TObject);
  Var myDouble: Double;
begin
  Edit3.Text := StringReplace(Edit3.Text, ',', '.', [rfReplaceAll, rfIgnoreCase]);
  if IsNumeric(Edit3.Text) then
  begin
     myDouble := StrToFloat(Edit3.Text);
     Edit3.Text := FloatToStr(myDouble);
  end
  else Edit3.Text := '0';
  UpdateCoord(Edit3);
end;

procedure TForm1.Edit4KeyPress(Sender: TObject; var Key: char);
begin
  Key := TextNumeric(Edit4, Key);
end;

procedure TForm1.Edit4Exit(Sender: TObject);
  Var myDouble: Double;
begin
  Edit4.Text := StringReplace(Edit4.Text, ',', '.', [rfReplaceAll, rfIgnoreCase]);
  if IsNumeric(Edit4.Text) then
  begin
     myDouble := StrToFloat(Edit4.Text);
     Edit4.Text := FloatToStr(myDouble);
  end
  else Edit4.Text := '0';
  UpdateCoord(Edit4);
end;

procedure TForm1.Edit5KeyPress(Sender: TObject; var Key: char);
begin
  Key := TextNumeric(Edit5, Key);
end;

procedure TForm1.Edit5Exit(Sender: TObject);
  Var myDouble: Double;
begin
  Edit5.Text := StringReplace(Edit5.Text, ',', '.', [rfReplaceAll, rfIgnoreCase]);
  if IsNumeric(Edit5.Text) then
  begin
     myDouble := StrToFloat(Edit5.Text);
     if myDouble >= 360 then
        myDouble := myDouble - (360 * Trunc(myDouble / 360.0));
     if myDouble <= -360 then
        myDouble := myDouble + (360 * Trunc(myDouble / -360.0));
     if myDouble > 180 then
        myDouble := 360 - myDouble;
     if myDouble <= -180 then
        myDouble := 360 + myDouble;
     Edit5.Text := FloatToStr(myDouble);
  end
  else Edit5.Text := '0';
  UpdateCoord(Edit5);
end;

procedure TForm1.Edit6KeyPress(Sender: TObject; var Key: char);
begin
  Key := TextNumeric(Edit6, Key);
end;

procedure TForm1.Edit6Exit(Sender: TObject);
  Var myDouble: Double;
begin
  Edit6.Text := StringReplace(Edit6.Text, ',', '.', [rfReplaceAll, rfIgnoreCase]);
  if IsNumeric(Edit6.Text) then
  begin
     myDouble := StrToFloat(Edit6.Text);
     Edit6.Text := FloatToStr(myDouble);
  end
  else Edit6.Text := '0';
  UpdateCoord(Edit6);
end;

procedure TForm1.FormCreate(Sender: TObject);
begin
  Form1.Top:=0;
  Form1.Left:=0;
end;

procedure TForm1.FormKeyPress(Sender: TObject; var Key: char);
begin
  if key=#13 then  //Enter key interception
   if (ActiveControl is TEdit) then
   begin
        key:=#0; //simulate the key Tab effect !
        SelectNext(ActiveControl,true, true);
    end;
end;

procedure TForm1.UpdateCoord(var myEdit: TEdit);
var
  X1: Double;
  Y1: Double;
  X2: Double;
  Y2: Double;
  angle: Double;
  uLength: Double;
const
  Pi = 3.1415926535897932384626433832795;
begin
  //WriteLn(Edit1.SelStart);
  X1 := StrToFloat(Edit1.Text);
  Y1 := StrToFloat(Edit2.Text);
  X2 := StrToFloat(Edit3.Text);
  Y2 := StrToFloat(Edit4.Text);
  angle := StrToFloat(Edit5.Text);
  uLength := StrToFloat(Edit6.Text);

  {case myEdit.Handle Of
    Edit1.Handle: WriteLn('Edit1');
    Edit2.Handle: WriteLn('Edit2');
    Edit3.Handle: WriteLn('Edit3');
    Edit4.Handle: WriteLn('Edit4');
    Edit5.Handle: WriteLn('Edit5');
    Edit6.Handle: WriteLn('Edit6');
    else ;
  end;}

  if myEdit.Handle = Edit1.Handle then
  begin
    if CheckBox1.Checked = true then
    begin
      if  CheckBox2.Checked = true then
      begin
        if  CheckBox3.Checked = true then
        begin
          X1 := X2 - (uLength * CosDegree(angle));
          Y1 := Y2 - (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end
      else
      begin
        if  CheckBox3.Checked = true then
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end;
    end
    else
    begin
      if  CheckBox2.Checked = true then
      begin
        if  CheckBox3.Checked = true then
        begin
          X1 := X2 - (uLength * CosDegree(angle));
          Y1 := Y2 - (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end
      else
      begin
        if  CheckBox3.Checked = true then
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end;
    end;
  end;

  if myEdit.Handle = Edit2.Handle then
  begin
    if CheckBox1.Checked = true then
    begin
      if  CheckBox2.Checked = true then
      begin
        if  CheckBox3.Checked = true then
        begin
          X1 := X2 - (uLength * CosDegree(angle));
          Y1 := Y2 - (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end
      else
      begin
        if  CheckBox3.Checked = true then
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end;
    end
    else
    begin
      if  CheckBox2.Checked = true then
      begin
        if  CheckBox3.Checked = true then
        begin
          X1 := X2 - (uLength * CosDegree(angle));
          Y1 := Y2 - (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end
      else
      begin
        if  CheckBox3.Checked = true then
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end;
    end;
  end;

  if myEdit.Handle = Edit3.Handle then
  begin
    if CheckBox2.Checked = true then
    begin
      if  CheckBox1.Checked = true then
      begin
        if  CheckBox3.Checked = true then
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end
      else
      begin
        if  CheckBox3.Checked = true then
        begin
          X1 := X2 - (uLength * CosDegree(angle));
          Y1 := Y2 - (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end;
    end
    else
    begin
      if  CheckBox1.Checked = true then
      begin
        if  CheckBox3.Checked = true then
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end
      else
      begin
        if  CheckBox3.Checked = true then
        begin
          X1 := X2 - (uLength * CosDegree(angle));
          Y1 := Y2 - (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end;
    end;
  end;

  if myEdit.Handle = Edit4.Handle then
  begin
    if CheckBox2.Checked = true then
    begin
      if  CheckBox1.Checked = true then
      begin
        if  CheckBox3.Checked = true then
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end
      else
      begin
        if  CheckBox3.Checked = true then
        begin
          X1 := X2 - (uLength * CosDegree(angle));
          Y1 := Y2 - (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end;
    end
    else
    begin
      if  CheckBox1.Checked = true then
      begin
        if  CheckBox3.Checked = true then
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * Sin(angle * Pi / 180));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end
      else
      begin
        if  CheckBox3.Checked = true then
        begin
          X1 := X2 - (uLength * CosDegree(angle));
          Y1 := Y2 - (uLength * SinDegree(angle));
        end
        else
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end;
      end;
    end;
  end;

  if myEdit.Handle = Edit5.Handle then
  begin
    if CheckBox3.Checked = true then
    begin
      if  CheckBox1.Checked = true then
      begin
        if  CheckBox2.Checked = true then
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end
        else
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * SinDegree(angle));
        end;
      end
      else
      begin
        if  CheckBox2.Checked = true then
        begin
          X1 := X2 - (uLength * CosDegree(angle));
          Y1 := Y2 - (uLength * SinDegree(angle));
        end
        else
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * SinDegree(angle));
        end;
      end;
    end
    else
    begin
      if  CheckBox1.Checked = true then
      begin
        if  CheckBox2.Checked = true then
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end
        else
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * SinDegree(angle));
        end;
      end
      else
      begin
        if  CheckBox2.Checked = true then
        begin
          X1 := X2 - (uLength * CosDegree(angle));
          Y1 := Y2 - (uLength * SinDegree(angle));
        end
        else
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * SinDegree(angle));
        end;
      end;
    end;
  end;

  if myEdit.Handle = Edit6.Handle then
  begin
    if CheckBox3.Checked = true then
    begin
      if  CheckBox1.Checked = true then
      begin
        if  CheckBox2.Checked = true then
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end
        else
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * SinDegree(angle));
        end;
      end
      else
      begin
        if  CheckBox2.Checked = true then
        begin
          X1 := X2 - (uLength * CosDegree(angle));
          Y1 := Y2 - (uLength * SinDegree(angle));
        end
        else
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * SinDegree(angle));
        end;
      end;
    end
    else
    begin
      if  CheckBox1.Checked = true then
      begin
        if  CheckBox2.Checked = true then
        begin
          uLength := Sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
          angle := ArcTan2((Y2-Y1), (X2-X1)) * 180 / Pi;  //returns degrees
        end
        else
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * SinDegree(angle));
        end;
      end
      else
      begin
        if  CheckBox2.Checked = true then
        begin
          X1 := X2 - (uLength * CosDegree(angle));
          Y1 := Y2 - (uLength * SinDegree(angle));
        end
        else
        begin
          X2 := X1 + (uLength * CosDegree(angle));
          Y2 := Y1 + (uLength * SinDegree(angle));
        end;
      end;
    end;
  end;

  Edit1.Text := FloatToStr(X1); //Origin_X
  Edit2.Text := FloatToStr(Y1); //Origin_Y
  Edit3.Text := FloatToStr(X2); //End_X
  Edit4.Text := FloatToStr(Y2); //End_Y
  Edit5.Text := FloatToStr(angle); //Angle
  Edit6.Text := FloatToStr(uLength); //Length
end;

end.

