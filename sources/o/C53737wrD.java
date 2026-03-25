package o;

import com.okinc.biz.TacticsType;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wrD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53737wrD {
    public static final C53737wrD KWHzl = new C53737wrD();

    /* JADX INFO: renamed from: o.wrD$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsType.values().length];
            try {
                iArr[TacticsType.TACTICS_GRDE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TacticsType.TACTICS_CONTRACT_GRID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TacticsType.TACTICS_SPOT_DCA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TacticsType.TACTICS_CONTRACT_DCA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[TacticsType.TACTICS_SIGNAL_BOT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[TacticsType.TACTICS_SMART_ARBITRAGE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[TacticsType.TACTICS_DCD_BOT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[TacticsType.TACTICS_RECURRING.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[TacticsType.TACTICS_SMART_PORTFOLIO.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[TacticsType.TACTICS_ARBITRAGE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[TacticsType.TACTICS_LLM_BOT.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[TacticsType.TACTICS_SMART_ICEBERG.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[TacticsType.TACTICS_TIME_WEIGHTED.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            OLrzqt = iArr;
        }
    }

    private C53737wrD() {
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(str);
        if (tacticsTypeAEQbTJ == null) {
            return "";
        }
        switch (StateListAnimator.OLrzqt[tacticsTypeAEQbTJ.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) (C56033xvF.getCoinTitleTacticsItem$default(str2, str3, false, null, str4, 12, null) + " " + C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName()))).toString();
                break;
            case 6:
                string = C33069mpW.copydefault(C55688xof.Application.MediaBrowserCompatCustomActionResultReceiver, C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoPair", C56051xvX.AEQbTJ.KWHzl(str5 == null ? "" : str5))));
                break;
            case 7:
                string = C33069mpW.copydefault(C55688xof.Application.invokespecialgBtXYZ, C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoPair", C56033xvF.getCoinTitle$default("SPOT", str3, false, null, null, 28, null))));
                break;
            case 8:
            case 9:
                string = str6;
                break;
            case 10:
                string = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName());
                break;
            default:
                string = "";
                break;
        }
        return string == null ? "" : string;
    }
}
