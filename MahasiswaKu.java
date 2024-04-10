package universitas.Mahasiswaa;

public class MahasiswaKu {

    public static void main(String[] args) {
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setStudentClass(21);

        System.out.println(m.geTNim());
        System.out.println(m.getName());
        System.out.println(m.getStudentClass());
    }
    
}
