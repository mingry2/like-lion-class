package studyclass.java_1006.numalphabet;

public interface AlphabetGenerator<T> {
    // 알파벳 생성기를 위한 새로운 인터페이스 박성(제네릭 활용)
    T generate(int num);
}
