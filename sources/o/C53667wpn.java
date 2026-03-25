package o;

import com.okinc.tradingbot.impl.planet.domain.BotDisplayName;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53667wpn extends vNA<StateListAnimator, BotDisplayName> {
    @yCM
    public C53667wpn() {
    }

    /* JADX INFO: renamed from: o.wpn$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.util.List<java.lang.String> copydefault;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.wpn$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.AEQbTJ;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = stateListAnimator.EZpvd;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = stateListAnimator.valueOf;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                list = stateListAnimator.copydefault;
            }
            java.util.List list2 = list;
            if ((i & 32) != 0) {
                str5 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.OLrzqt(str, str6, str7, str8, list2, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new StateListAnimator(str, str2, str3, str4, list, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) stateListAnimator.valueOf) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(ordType=" + this.KWHzl + ", instId=" + this.AEQbTJ + ", instType=" + this.EZpvd + ", smartArbInstFamily=" + this.valueOf + ", instIds=" + this.copydefault + ", customStrategyName=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.valueOf;
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.EZpvd = str3;
            this.valueOf = str4;
            this.copydefault = list;
            this.OLrzqt = str5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [35=5] */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r1.equals("grid") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r1.equals("contract_grid") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        if (r1.equals("smart_portfolio") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
    
        if (r1.equals("contract_dca") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f4, code lost:
    
        if (r1.equals("spot_dca") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f7, code lost:
    
        r4 = o.C54589xNz.EZpvd.copydefault();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fd, code lost:
    
        if (r4 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ff, code lost:
    
        r0 = o.InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(r4, r13.OLrzqt(), r13.copydefault(), null, null, 12, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0110, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r1.equals("dcd_bot") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r1.equals("recurring") == false) goto L43;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.vNA
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BotDisplayName KWHzl(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        java.lang.String strKWHzl = stateListAnimator.KWHzl();
        switch (strKWHzl.hashCode()) {
            case -1831183611:
                break;
            case -1402017003:
                break;
            case -1216369070:
                break;
            case -1086683216:
                if (strKWHzl.equals("signal_bot")) {
                }
                break;
            case -557961837:
                if (strKWHzl.equals("smart_arbitrage")) {
                    java.lang.String strAEQbTJ = xUW.KWHzl.AEQbTJ(stateListAnimator.valueOf());
                    java.lang.String strCopydefault = TaskDescription.AEQbTJ(strAEQbTJ).copydefault();
                    java.util.Locale locale = java.util.Locale.ROOT;
                    java.lang.String upperCase = strCopydefault.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    java.lang.String upperCase2 = TaskDescription.AEQbTJ(strAEQbTJ).AEQbTJ().toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                }
                break;
            case -512749997:
                break;
            case 3181382:
                break;
            case 1165749981:
                break;
            case 1485620813:
                break;
        }
        return new BotDisplayName.Plain(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, stateListAnimator.copydefault(), stateListAnimator.OLrzqt(), false, false, null, false, null, 92, null));
    }

    public static final java.lang.CharSequence KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null));
        return str2 == null ? "" : str2;
    }
}
