package o;

import com.okinc.localization2.KeysLog;
import com.okinc.localization2.bean.AppLocaleInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pUA {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final pSI AEQbTJ;
    public final pSI AYXKKw;
    public final C38311pUb EZpvd;
    public final KeysLog KWHzl;
    public final pSI copydefault;
    public final pSI gEmmrt;

    public pUA(@NotNull pSI psi, @NotNull pSI psi2, @NotNull pSI psi3, @NotNull pSI psi4, @NotNull C38311pUb c38311pUb, @NotNull KeysLog keysLog) {
        Intrinsics.checkNotNullParameter(psi, "");
        Intrinsics.checkNotNullParameter(psi2, "");
        Intrinsics.checkNotNullParameter(psi3, "");
        Intrinsics.checkNotNullParameter(psi4, "");
        Intrinsics.checkNotNullParameter(c38311pUb, "");
        Intrinsics.checkNotNullParameter(keysLog, "");
        this.AEQbTJ = psi;
        this.copydefault = psi2;
        this.AYXKKw = psi3;
        this.gEmmrt = psi4;
        this.EZpvd = c38311pUb;
        this.KWHzl = keysLog;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.Object... objArr) {
        java.util.Locale localeAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        java.lang.CharSequence charSequenceAEQbTJ = AEQbTJ(str);
        if (charSequenceAEQbTJ == null) {
            return null;
        }
        try {
            AppLocaleInfo appLocaleInfoCopydefault = this.EZpvd.copydefault();
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            if (appLocaleInfoCopydefault == null || (localeAEQbTJ = appLocaleInfoCopydefault.getLocale()) == null) {
                localeAEQbTJ = pTG.OLrzqt.AEQbTJ((java.lang.String) null);
            }
            java.lang.String string = charSequenceAEQbTJ.toString();
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            java.lang.String str2 = java.lang.String.format(localeAEQbTJ, string, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            return str2;
        } catch (java.lang.Exception e) {
            pUU.copydefault("StringResourceRepo", "sdkGetString error! entryName " + str + ". e:" + e.getMessage());
            return charSequenceAEQbTJ.toString();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pSQ.reportUsedKey$default(o.pSQ, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):void */
    public final java.lang.CharSequence AEQbTJ(@NotNull final java.lang.String str) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.CharSequence charSequenceKWHzl = KWHzl(str, new Function1() { // from class: o.pUK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pUA.valueOf(this.EZpvd, str, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pUS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pUA.gEmmrt(this.OLrzqt, str, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pUH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pUA.AkhnZx(this.AEQbTJ, str, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pUJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pUA.fetchVPNInfo(this.OLrzqt, str, (java.lang.String) obj);
            }
        });
        pSQ.reportUsedKey$default(pSQ.copydefault, str, (charSequenceKWHzl == null || (string = charSequenceKWHzl.toString()) == null) ? "" : string, null, 4, null);
        this.KWHzl.logIfNecessary(str, charSequenceKWHzl);
        return charSequenceKWHzl;
    }

    public static final java.lang.CharSequence valueOf(pUA pua, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return pua.AEQbTJ.OLrzqt(str);
    }

    public static final java.lang.CharSequence gEmmrt(pUA pua, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return pua.copydefault.OLrzqt(str);
    }

    public static final java.lang.CharSequence AkhnZx(pUA pua, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return pua.AYXKKw.OLrzqt(str);
    }

    public static final java.lang.CharSequence fetchVPNInfo(pUA pua, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return pua.gEmmrt.OLrzqt(str);
    }

    public final java.lang.CharSequence OLrzqt(@NotNull final java.lang.String str, final int i, final java.util.Map<java.lang.Object, ? extends java.lang.Object> map) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.CharSequence charSequenceKWHzl = KWHzl(str, new Function1() { // from class: o.pUC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pUA.EZpvd(this.OLrzqt, str, i, map, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pUI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pUA.valueOf(this.copydefault, str, i, map, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pUF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pUA.AhwBna(this.EZpvd, str, i, map, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pUG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pUA.gEmmrt(this.copydefault, str, i, map, (java.lang.String) obj);
            }
        });
        pSQ.reportUsedKey$default(pSQ.copydefault, str, (charSequenceKWHzl == null || (string = charSequenceKWHzl.toString()) == null) ? "" : string, null, 4, null);
        this.KWHzl.logIfNecessary(str, charSequenceKWHzl);
        return charSequenceKWHzl;
    }

    public static final java.lang.CharSequence EZpvd(pUA pua, java.lang.String str, int i, java.util.Map map, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return pua.AEQbTJ.EZpvd(str, i, map);
    }

    public static final java.lang.CharSequence valueOf(pUA pua, java.lang.String str, int i, java.util.Map map, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return pua.copydefault.EZpvd(str, i, map);
    }

    public static final java.lang.CharSequence AhwBna(pUA pua, java.lang.String str, int i, java.util.Map map, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return pua.AYXKKw.EZpvd(str, i, map);
    }

    public static final java.lang.CharSequence gEmmrt(pUA pua, java.lang.String str, int i, java.util.Map map, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return pua.gEmmrt.EZpvd(str, i, map);
    }

    public final java.lang.String[] KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.CharSequence[] charSequenceArrEZpvd = EZpvd(str);
        if (charSequenceArrEZpvd == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(charSequenceArrEZpvd.length);
        for (java.lang.CharSequence charSequence : charSequenceArrEZpvd) {
            arrayList.add(charSequence.toString());
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public final java.lang.CharSequence[] EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(str, new Function1() { // from class: o.pUO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pUA.DbNXlk(this.EZpvd, str, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pUN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pUA.values(this.OLrzqt, str, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pUM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pUA.isConnected(this.KWHzl, str, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pUL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pUA.fJNWhG(this.KWHzl, str, (java.lang.String) obj);
            }
        });
    }

    public static final java.lang.CharSequence[] DbNXlk(pUA pua, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return pua.AEQbTJ.AEQbTJ(str);
    }

    public static final java.lang.CharSequence[] values(pUA pua, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return pua.copydefault.AEQbTJ(str);
    }

    public static final java.lang.CharSequence[] isConnected(pUA pua, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return pua.AYXKKw.AEQbTJ(str);
    }

    public static final java.lang.CharSequence[] fJNWhG(pUA pua, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return pua.gEmmrt.AEQbTJ(str);
    }

    public final java.lang.CharSequence KWHzl(java.lang.String str, Function1<? super java.lang.String, ? extends java.lang.CharSequence> function1, Function1<? super java.lang.String, ? extends java.lang.CharSequence> function12, Function1<? super java.lang.String, ? extends java.lang.CharSequence> function13, Function1<? super java.lang.String, ? extends java.lang.CharSequence> function14) {
        java.util.Iterator it = yDY.gEmmrt(function1, function12, function13, function14).iterator();
        while (it.hasNext()) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) ((Function1) it.next()).invoke(str);
            if (C33129mqd.OLrzqt(charSequence)) {
                return charSequence;
            }
        }
        return null;
    }

    public final java.lang.CharSequence[] copydefault(java.lang.String str, Function1<? super java.lang.String, java.lang.CharSequence[]> function1, Function1<? super java.lang.String, java.lang.CharSequence[]> function12, Function1<? super java.lang.String, java.lang.CharSequence[]> function13, Function1<? super java.lang.String, java.lang.CharSequence[]> function14) {
        java.util.Iterator it = yDY.gEmmrt(function1, function12, function13, function14).iterator();
        while (it.hasNext()) {
            java.lang.CharSequence[] charSequenceArr = (java.lang.CharSequence[]) ((Function1) it.next()).invoke(str);
            if (charSequenceArr != null && charSequenceArr.length != 0) {
                return charSequenceArr;
            }
        }
        return null;
    }

    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ.KWHzl() + "," + this.copydefault.KWHzl() + "," + this.AYXKKw.KWHzl() + "," + this.gEmmrt.KWHzl();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pUA.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
