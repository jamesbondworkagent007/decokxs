package o;

import com.okinc.tradingbot.impl.aiBot.dto.AiDetailResponseDto;
import com.okinc.unify_trade.biz.TechnicalIndex;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48174uHs;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48174uHs {
    public static final Activity Companion = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final int AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final uJI OLrzqt;
    public final java.lang.String copydefault;
    public final java.util.List<C48178uHw> djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final uJI EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48174uHs copydefault(@NotNull uJI uji, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C48178uHw> list, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(uji, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new C48174uHs(uji, str, str2, list, str3, str4, str5, i, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C48178uHw> djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48174uHs)) {
            return false;
        }
        C48174uHs c48174uHs = (C48174uHs) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c48174uHs.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c48174uHs.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c48174uHs.EZpvd) && Intrinsics.EZpvd(this.djBIcL, c48174uHs.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c48174uHs.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c48174uHs.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c48174uHs.gEmmrt) && this.AYXKKw == c48174uHs.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c48174uHs.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c48174uHs.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Integer.hashCode(this.AYXKKw)) * 31) + this.valueOf.hashCode()) * 31) + this.AhwBna.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LLMSignalDetailsUiModel(aiModel=" + this.OLrzqt + ", instType=" + this.AEQbTJ + ", businessLine=" + this.EZpvd + ", tradingPairs=" + this.djBIcL + ", aiThinkingInterval=" + this.copydefault + ", chartTimeframe=" + this.KWHzl + ", technicalIndicators=" + this.gEmmrt + ", technicalIndicatorsCount=" + this.AYXKKw + ", userPrompt=" + this.valueOf + ", userPromptEn=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    public C48174uHs(@NotNull uJI uji, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C48178uHw> list, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(uji, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.OLrzqt = uji;
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.djBIcL = list;
        this.copydefault = str3;
        this.KWHzl = str4;
        this.gEmmrt = str5;
        this.AYXKKw = i;
        this.valueOf = str6;
        this.AhwBna = str7;
    }

    /* JADX INFO: renamed from: o.uHs$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uHs.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C48174uHs EZpvd(@NotNull AiDetailResponseDto aiDetailResponseDto) {
            Intrinsics.checkNotNullParameter(aiDetailResponseDto, "");
            uJI uji = new uJI(aiDetailResponseDto.OLrzqt().getName(), C53418wlC.AEQbTJ(aiDetailResponseDto.OLrzqt().getIconUrl()));
            java.lang.String strEZpvd = aiDetailResponseDto.EZpvd();
            java.lang.String strAEQbTJ = AEQbTJ(aiDetailResponseDto.EZpvd());
            java.util.List<java.lang.String> listKWHzl = aiDetailResponseDto.KWHzl();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            for (java.lang.String str : listKWHzl) {
                java.lang.String upperCase = TaskDescription.AEQbTJ(str).copydefault().toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                arrayList.add(new C48178uHw(str, C52684wUn.AEQbTJ(upperCase), C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, aiDetailResponseDto.EZpvd(), false, false, 12, null)));
            }
            return new C48174uHs(uji, strEZpvd, strAEQbTJ, arrayList, C53418wlC.KWHzl(aiDetailResponseDto.copydefault().getAiThinkingInterval()), copydefault(aiDetailResponseDto.copydefault().getKLineLevels()), EZpvd(aiDetailResponseDto.copydefault().getTechnicalIndexes()), aiDetailResponseDto.copydefault().getTechnicalIndexes().size(), aiDetailResponseDto.AhwBna(), aiDetailResponseDto.valueOf());
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        
            if (r0.equals("FUTURES") == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        
            if (r0.equals("SWAP") == false) goto L20;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String AEQbTJ(java.lang.String str) {
            java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            switch (upperCase.hashCode()) {
                case -2027980370:
                    if (upperCase.equals("MARGIN")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistryKtrememberLauncherForActivityResultkey1);
                    }
                    return C53418wlC.KWHzl(str);
                case 2552066:
                    if (upperCase.equals("SPOT")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.dispose);
                    }
                    return C53418wlC.KWHzl(str);
                case 2558355:
                    break;
                case 214415088:
                    break;
                default:
                    return C53418wlC.KWHzl(str);
            }
            return C33070mpX.AYXKKw(C55688xof.Application.BackHandlerlambda0);
        }

        public final java.lang.String copydefault(java.util.List<java.lang.String> list) {
            return list.isEmpty() ? "--" : CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null);
        }

        public final java.lang.String EZpvd(java.util.List<TechnicalIndex> list) {
            return list.isEmpty() ? "--" : CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: o.uHt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C48174uHs.Activity.KWHzl((TechnicalIndex) obj);
                }
            }, 31, null);
        }

        public static final java.lang.CharSequence KWHzl(TechnicalIndex technicalIndex) {
            Intrinsics.checkNotNullParameter(technicalIndex, "");
            java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(technicalIndex.getParams(), null, null, null, 0, null, new Function1() { // from class: o.uHv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C48174uHs.Activity.EZpvd((java.lang.String) obj);
                }
            }, 31, null);
            if (strJoinToString$default.length() > 0) {
                return technicalIndex.getIndicator() + "(" + strJoinToString$default + ")";
            }
            return technicalIndex.getIndicator();
        }

        public static final java.lang.CharSequence EZpvd(java.lang.String str) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(str, "");
            Activity activity = C48174uHs.Companion;
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(pTB.formatDownToMax$default(pTB.OLrzqt((java.lang.Object) str), 4, null, 2, null));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.String str2 = (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            return str2 == null ? "" : str2;
        }
    }
}
