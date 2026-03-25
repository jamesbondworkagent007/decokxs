package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class uBF extends uBH {
    public java.lang.String AEQbTJ;

    public uBF() {
        super(new Function0() { // from class: o.uBG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uBF.EZpvd();
            }
        });
        this.AEQbTJ = "";
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    @Override // o.uBH, android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String strValueOf = java.lang.String.valueOf(editable);
        if (!Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) strValueOf)) {
            onTextChanged(strValueOf, 0, this.AEQbTJ.length(), strValueOf.length());
        }
        this.AEQbTJ = strValueOf;
    }
}
