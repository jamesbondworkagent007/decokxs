package o;

import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.impl.number.Modifier;
import com.ibm.icu.text.PluralRules;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.FieldPosition;

/* JADX INFO: renamed from: o.aee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7163aee extends PluralRules.TaskDescription {
    int AEQbTJ() throws java.lang.ArithmeticException;

    void AEQbTJ(int i);

    void AEQbTJ(int i, MathContext mathContext);

    void AEQbTJ(BigDecimal bigDecimal);

    Modifier.Signum AYXKKw();

    BigDecimal AhwBna();

    byte EZpvd(int i);

    int EZpvd();

    int KWHzl();

    void KWHzl(int i);

    void KWHzl(FieldPosition fieldPosition);

    StandardPlural OLrzqt(PluralRules pluralRules);

    InterfaceC7163aee OLrzqt();

    void OLrzqt(int i);

    void OLrzqt(int i, MathContext mathContext);

    void copydefault(int i);

    void copydefault(BigDecimal bigDecimal);

    void copydefault(BigDecimal bigDecimal, MathContext mathContext);

    boolean copydefault();

    void djBIcL();

    void gEmmrt();

    @Override // com.ibm.icu.text.PluralRules.TaskDescription
    boolean isInfinite();

    @Override // com.ibm.icu.text.PluralRules.TaskDescription
    boolean isNaN();

    void valueOf(int i);

    boolean valueOf();
}
