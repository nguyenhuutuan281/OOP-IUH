public class main {
    private int MaSV;
    private String HoTen;
    private float DiemLT;
    private float DiemTH;

    public void setMaSV(int maSV) {
        if (maSV < 0 )
            this.MaSV = 0;
        else
            this.MaSV = maSV;

    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }

    public float getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(float diemLT) {
        if (diemLT >= 0 && diemLT <= 10)
            this.DiemLT = diemLT;
        else
            this.DiemLT = 0;
    }

    public float getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(int diemTH) {
        if (diemTH >= 0 && diemTH <= 10)
            this.DiemTH = diemTH;
        else
            this.DiemTH = 0;
    }
}