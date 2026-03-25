package o;

import aws.smithy.kotlin.runtime.serde.json.LexerState;
import com.amplifyframework.core.model.ModelIdentifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EK implements ET {
    public final java.util.List<LexerState> AEQbTJ;
    public final java.lang.StringBuilder EZpvd;
    public int KWHzl;
    public final boolean copydefault;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LexerState.values().length];
            try {
                iArr[LexerState.ArrayFirstValueOrEnd.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LexerState.ArrayNextValueOrEnd.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[LexerState.ObjectFieldValue.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EK() {
        this(false, 1, null);
    }

    public EK(boolean z) {
        this.copydefault = z;
        this.EZpvd = new java.lang.StringBuilder();
        this.AEQbTJ = yDY.AhwBna(LexerState.Initial);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:21) call: o.EK.<init>(boolean):void type: THIS */
    public /* synthetic */ EK(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // o.ET
    public byte[] OLrzqt() {
        java.lang.String string = this.EZpvd.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return C59449zhJ.getNewProxyInstance(string);
    }

    @Override // o.ET
    public void KWHzl() {
        AEQbTJ("{", LexerState.ObjectFirstKeyOrEnd);
    }

    @Override // o.ET
    public void EZpvd() {
        copydefault("}", LexerState.ObjectFirstKeyOrEnd, LexerState.ObjectNextKeyOrEnd);
    }

    @Override // o.ET
    public void AEQbTJ() {
        AEQbTJ("[", LexerState.ArrayFirstValueOrEnd);
    }

    @Override // o.ET
    public void copydefault() {
        copydefault("]", LexerState.ArrayFirstValueOrEnd, LexerState.ArrayNextValueOrEnd);
    }

    public final void AEQbTJ(java.lang.String str, LexerState lexerState) {
        OLrzqt(str);
        AYXKKw();
        this.KWHzl++;
        C56455yG.copydefault(this.AEQbTJ, lexerState);
    }

    public final void copydefault(java.lang.String str, LexerState... lexerStateArr) {
        AYXKKw();
        this.KWHzl--;
        gEmmrt();
        this.EZpvd.append(str);
        LexerState lexerState = (LexerState) C56455yG.copydefault(this.AEQbTJ);
        if (yDV.valueOf(lexerStateArr, lexerState)) {
            return;
        }
        throw new java.lang.IllegalStateException(("Invalid JSON encoder state " + lexerState + "; expected one of " + yDV.joinToString$default(lexerStateArr, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (Function1) null, 63, (java.lang.Object) null)).toString());
    }

    public final void gEmmrt() {
        int i;
        if (!this.copydefault || (i = this.KWHzl) <= 0) {
            return;
        }
        this.EZpvd.append(C59449zhJ.copydefault(" ", i * 4));
    }

    public final void AYXKKw() {
        if (this.copydefault) {
            this.EZpvd.append('\n');
        }
    }

    public final void djBIcL() {
        this.EZpvd.append(",");
        AYXKKw();
    }

    public final void AhwBna() {
        this.EZpvd.append(":");
        if (this.copydefault) {
            this.EZpvd.append(" ");
        }
    }

    public final void OLrzqt(java.lang.String str) {
        int i = Application.AEQbTJ[((LexerState) C56455yG.EZpvd(this.AEQbTJ)).ordinal()];
        if (i == 1) {
            C56455yG.OLrzqt(this.AEQbTJ, LexerState.ArrayNextValueOrEnd);
            gEmmrt();
        } else if (i == 2) {
            djBIcL();
            gEmmrt();
        } else if (i == 3) {
            AhwBna();
            C56455yG.OLrzqt(this.AEQbTJ, LexerState.ObjectNextKeyOrEnd);
        }
        this.EZpvd.append(str);
    }

    @Override // o.ET
    public void valueOf() {
        OLrzqt(AbstractJsonLexerKt.NULL);
    }

    public final void copydefault(java.lang.StringBuilder sb, java.lang.String str) {
        sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        sb.append(str);
        sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    @Override // o.ET
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C56455yG.EZpvd(this.AEQbTJ) == LexerState.ObjectNextKeyOrEnd) {
            djBIcL();
        }
        gEmmrt();
        copydefault(this.EZpvd, EJ.KWHzl(str));
        C56455yG.OLrzqt(this.AEQbTJ, LexerState.ObjectFieldValue);
    }

    @Override // o.ET
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt('\"' + EJ.KWHzl(str) + '\"');
    }

    @Override // o.ET
    public void OLrzqt(boolean z) {
        OLrzqt(java.lang.String.valueOf(z));
    }

    public final void EZpvd(java.lang.Number number) {
        OLrzqt(number.toString());
    }

    @Override // o.ET
    public void AEQbTJ(long j) {
        EZpvd(java.lang.Long.valueOf(j));
    }

    @Override // o.ET
    public void KWHzl(int i) {
        EZpvd(java.lang.Integer.valueOf(i));
    }

    @Override // o.ET
    public void AEQbTJ(float f) {
        EZpvd(java.lang.Float.valueOf(f));
    }

    @Override // o.ET
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(str);
    }
}
