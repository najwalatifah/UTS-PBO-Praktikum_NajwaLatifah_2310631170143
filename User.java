package reservasihotel;

import java.util.List;

public interface User {
    void LihatKamar(List<Kamar> kamar);
    void bookRoom (Kamar kamar);
}
