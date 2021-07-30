import java.util.HashMap;
import java.util.Map;

public enum Simbolos {
    ZERO ("0"),
    UM ("1"),
    DOIS ("2"),
    TRES ("3"),
    QUATRO ("4"),
    CINCO ("5"),
    SEIS ("6"),
    SETE ("7"),
    OITO ("8"),
    NOVE ("9"),
    PULAR ("Pular"),
    INVERTER ("Inverter"),
    MAIS_DOIS ("+2"),
    MAIS_QUATRO ("+4"),
    MUDA_COR ("Muda Cor");
    
    private String simbolo;

    Simbolos(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo(){
        return this.simbolo;
    }

    public static Map<String, Simbolos> byId;
    static {
        byId = new HashMap<String, Simbolos>();
        for(Simbolos simbolo : values())
            byId.put(simbolo.getSimbolo(), simbolo);
    }
}
