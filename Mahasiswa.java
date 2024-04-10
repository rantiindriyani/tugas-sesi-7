package universitas.Mahasiswaa;

public class Mahasiswa<TNim, TName, TClass> {
    private TNim nim;
    private TName name;
    private TClass studentClass;


    public TNim geTNim() {
        return nim;
    }

    public void setNim(TNim nim) {
        this.nim = nim;
    }

    public TName getName() {
        return name;
    }

    public void setName(TName name) {
        this.name = name;
    }

    public TClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(TClass studentClass) {
        this.studentClass = studentClass;
    }
}
