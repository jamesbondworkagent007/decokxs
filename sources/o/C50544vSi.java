package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.bot.EarnType;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vSi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50544vSi extends vNH<StateListAnimator, TaskDescription> {
    public final InterfaceC56387yDm OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX INFO: renamed from: o.vSi$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EarnType.values().length];
            try {
                iArr[EarnType.Ratio.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EarnType.Absolute.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C50544vSi(@NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vSh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50544vSi.OLrzqt();
            }
        });
    }

    public final xMS AEQbTJ() {
        return (xMS) this.OLrzqt.getValue();
    }

    public static final xMS OLrzqt() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentEZpvd = xLX.OLrzqt(BizInfoConfig.DefaultBizConfig.copydefault).EZpvd();
        if (bizInstrumentEZpvd == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(bizInstrumentEZpvd.getInstType())) == null) {
            return null;
        }
        return abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentEZpvd.getInstFamily());
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.vNH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull StateListAnimator stateListAnimator, @NotNull Continuation<? super TaskDescription> continuation) {
        InterfaceC56538yJb<java.lang.String> interfaceC56538yJbCopydefault = copydefault(stateListAnimator.AEQbTJ(), stateListAnimator.KWHzl(), stateListAnimator.AhwBna(), stateListAnimator.copydefault(), stateListAnimator.OLrzqt(), true);
        kotlin.Pair<InterfaceC56538yJb<java.lang.String>, InterfaceC56538yJb<java.lang.String>> pairEZpvd = EZpvd(stateListAnimator.AEQbTJ(), stateListAnimator);
        InterfaceC56538yJb<java.lang.String> interfaceC56538yJbComponent1 = pairEZpvd.component1();
        InterfaceC56538yJb<java.lang.String> interfaceC56538yJbComponent2 = pairEZpvd.component2();
        kotlin.Pair<C50546vSk, C50546vSk> pairKWHzl = C50539vSd.KWHzl(stateListAnimator.AEQbTJ(), C56547yJk.EZpvd(stateListAnimator.KWHzl(), stateListAnimator.AhwBna()), interfaceC56538yJbComponent1);
        return new TaskDescription(interfaceC56538yJbCopydefault, EZpvd(stateListAnimator.AEQbTJ(), C56547yJk.EZpvd(stateListAnimator.EZpvd().getDefaultMinRange(), stateListAnimator.EZpvd().getDefaultMaxRange()), stateListAnimator.OLrzqt()), interfaceC56538yJbComponent2, pairKWHzl.component1(), pairKWHzl.component2());
    }

    public final kotlin.Pair<InterfaceC56538yJb<java.lang.String>, InterfaceC56538yJb<java.lang.String>> EZpvd(EarnType earnType, StateListAnimator stateListAnimator) {
        InterfaceC56538yJb<java.lang.String> interfaceC56538yJbCopydefault = C50539vSd.copydefault(earnType, stateListAnimator.EZpvd(), stateListAnimator.OLrzqt());
        int i = ActionBar.EZpvd[earnType.ordinal()];
        if (i == 1) {
            return C56390yDp.OLrzqt(interfaceC56538yJbCopydefault, C56547yJk.EZpvd(pTB.formatICUPercent$default(C33129mqd.EZpvd(interfaceC56538yJbCopydefault.getStart()), null, null, null, java.lang.Double.valueOf(100.0d), null, 23, null), pTB.formatICUPercent$default(C33129mqd.EZpvd(interfaceC56538yJbCopydefault.getEndInclusive()), null, null, null, java.lang.Double.valueOf(100.0d), null, 23, null)));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C56390yDp.OLrzqt(interfaceC56538yJbCopydefault, C56547yJk.EZpvd(C53422wlG.copydefault((java.lang.String) interfaceC56538yJbCopydefault.getStart(), AEQbTJ()), C53422wlG.copydefault((java.lang.String) interfaceC56538yJbCopydefault.getEndInclusive(), AEQbTJ())));
    }

    public final InterfaceC56538yJb<java.lang.String> copydefault(EarnType earnType, java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC56538yJb<java.lang.String> interfaceC56538yJb, boolean z) {
        java.lang.String strMulS$default;
        java.lang.String strMulS$default2;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return C56547yJk.EZpvd("", "");
        }
        java.lang.String str4 = (java.lang.String) interfaceC56538yJb.getStart();
        java.lang.String str5 = (java.lang.String) interfaceC56538yJb.getEndInclusive();
        java.lang.String strSubS$default = C33129mqd.subS$default(str5, str4, null, null, null, 14, null);
        int[] iArr = ActionBar.EZpvd;
        int i = iArr[earnType.ordinal()];
        if (i == 1) {
            strMulS$default = C33129mqd.mulS$default(C33129mqd.divS$default(str, java.lang.Double.valueOf(100.0d), null, null, null, 14, null), strSubS$default, null, null, null, 14, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strMulS$default = str;
        }
        int i2 = iArr[earnType.ordinal()];
        if (i2 == 1) {
            strMulS$default2 = C33129mqd.mulS$default(C33129mqd.divS$default(str2, java.lang.Double.valueOf(100.0d), null, null, null, 14, null), strSubS$default, null, null, null, 14, null);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strMulS$default2 = str2;
        }
        java.lang.String strEZpvd = C33129mqd.EZpvd(str4, C33129mqd.KWHzl(C33129mqd.subS$default(str3, strMulS$default, null, null, null, 14, null), C33129mqd.subS$default(str5, strMulS$default, null, null, null, 14, null)));
        java.lang.String strKWHzl = C33129mqd.KWHzl(str5, C33129mqd.EZpvd(C33129mqd.addS$default(str3, strMulS$default2, null, null, null, 14, null), C33129mqd.addS$default(str4, strMulS$default2, null, null, null, 14, null)));
        if (z) {
            strEZpvd = C53422wlG.copydefault(strEZpvd, AEQbTJ());
        }
        if (z) {
            strKWHzl = C53422wlG.copydefault(strKWHzl, AEQbTJ());
        }
        return C56547yJk.EZpvd(strEZpvd, strKWHzl);
    }

    public final InterfaceC56538yJb<java.lang.String> EZpvd(@NotNull EarnType earnType, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb2) {
        Intrinsics.checkNotNullParameter(earnType, "");
        Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
        Intrinsics.checkNotNullParameter(interfaceC56538yJb2, "");
        int i = ActionBar.EZpvd[earnType.ordinal()];
        if (i == 1) {
            return C56547yJk.EZpvd(C33129mqd.mulS$default(interfaceC56538yJb.getStart(), java.lang.Double.valueOf(100.0d), null, null, null, 14, null), C33129mqd.mulS$default(interfaceC56538yJb.getEndInclusive(), java.lang.Double.valueOf(100.0d), null, null, null, 14, null));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.String strSubS$default = C33129mqd.subS$default(interfaceC56538yJb2.getEndInclusive(), interfaceC56538yJb2.getStart(), null, null, null, 14, null);
        return C56547yJk.EZpvd(C33129mqd.mulS$default(interfaceC56538yJb.getStart(), strSubS$default, null, null, null, 14, null), C33129mqd.mulS$default(interfaceC56538yJb.getEndInclusive(), strSubS$default, null, null, null, 14, null));
    }

    public final InterfaceC56538yJb<java.lang.String> EZpvd(@NotNull EarnType earnType, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb) {
        Intrinsics.checkNotNullParameter(earnType, "");
        Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
        int i = ActionBar.EZpvd[earnType.ordinal()];
        if (i == 1) {
            return C56547yJk.EZpvd(C33129mqd.mulS$default(interfaceC56538yJb.getStart(), java.lang.Double.valueOf(100.0d), null, null, null, 14, null), C33129mqd.mulS$default(interfaceC56538yJb.getEndInclusive(), java.lang.Double.valueOf(100.0d), null, null, null, 14, null));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C56547yJk.EZpvd(interfaceC56538yJb.getStart(), interfaceC56538yJb.getEndInclusive());
    }

    /* JADX INFO: renamed from: o.vSi$StateListAnimator */
    public static final class StateListAnimator {
        public static final int copydefault = SmartEarnConfig.$stable;
        public final SmartEarnConfig AEQbTJ;
        public final InterfaceC56538yJb<java.lang.String> EZpvd;
        public final EarnType KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String djBIcL;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.vSi$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, InterfaceC56538yJb interfaceC56538yJb, EarnType earnType, java.lang.String str, java.lang.String str2, java.lang.String str3, SmartEarnConfig smartEarnConfig, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC56538yJb = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                earnType = stateListAnimator.KWHzl;
            }
            EarnType earnType2 = earnType;
            if ((i & 4) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            java.lang.String str4 = str;
            if ((i & 8) != 0) {
                str2 = stateListAnimator.djBIcL;
            }
            java.lang.String str5 = str2;
            if ((i & 16) != 0) {
                str3 = stateListAnimator.valueOf;
            }
            java.lang.String str6 = str3;
            if ((i & 32) != 0) {
                smartEarnConfig = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.EZpvd(interfaceC56538yJb, earnType2, str4, str5, str6, smartEarnConfig);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EarnType AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SmartEarnConfig EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb, @NotNull EarnType earnType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull SmartEarnConfig smartEarnConfig) {
            Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
            Intrinsics.checkNotNullParameter(earnType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(smartEarnConfig, "");
            return new StateListAnimator(interfaceC56538yJb, earnType, str, str2, str3, smartEarnConfig);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56538yJb<java.lang.String> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
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
            return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && this.KWHzl == stateListAnimator.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) stateListAnimator.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) stateListAnimator.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(gridRange=" + this.EZpvd + ", earnType=" + this.KWHzl + ", lastPrice=" + this.OLrzqt + ", xValue=" + this.djBIcL + ", yValue=" + this.valueOf + ", config=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb, @NotNull EarnType earnType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull SmartEarnConfig smartEarnConfig) {
            Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
            Intrinsics.checkNotNullParameter(earnType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(smartEarnConfig, "");
            this.EZpvd = interfaceC56538yJb;
            this.KWHzl = earnType;
            this.OLrzqt = str;
            this.djBIcL = str2;
            this.valueOf = str3;
            this.AEQbTJ = smartEarnConfig;
        }
    }

    /* JADX INFO: renamed from: o.vSi$TaskDescription */
    public static final class TaskDescription {
        public final C50546vSk AEQbTJ;
        public final InterfaceC56538yJb<java.lang.String> EZpvd;
        public final InterfaceC56538yJb<java.lang.String> KWHzl;
        public final C50546vSk OLrzqt;
        public final InterfaceC56538yJb<java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.vSi$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, InterfaceC56538yJb interfaceC56538yJb, InterfaceC56538yJb interfaceC56538yJb2, InterfaceC56538yJb interfaceC56538yJb3, C50546vSk c50546vSk, C50546vSk c50546vSk2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC56538yJb = taskDescription.copydefault;
            }
            if ((i & 2) != 0) {
                interfaceC56538yJb2 = taskDescription.EZpvd;
            }
            InterfaceC56538yJb interfaceC56538yJb4 = interfaceC56538yJb2;
            if ((i & 4) != 0) {
                interfaceC56538yJb3 = taskDescription.KWHzl;
            }
            InterfaceC56538yJb interfaceC56538yJb5 = interfaceC56538yJb3;
            if ((i & 8) != 0) {
                c50546vSk = taskDescription.AEQbTJ;
            }
            C50546vSk c50546vSk3 = c50546vSk;
            if ((i & 16) != 0) {
                c50546vSk2 = taskDescription.OLrzqt;
            }
            return taskDescription.KWHzl(interfaceC56538yJb, interfaceC56538yJb4, interfaceC56538yJb5, c50546vSk3, c50546vSk2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C50546vSk AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56538yJb<java.lang.String> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb2, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb3, C50546vSk c50546vSk, C50546vSk c50546vSk2) {
            Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
            Intrinsics.checkNotNullParameter(interfaceC56538yJb2, "");
            Intrinsics.checkNotNullParameter(interfaceC56538yJb3, "");
            return new TaskDescription(interfaceC56538yJb, interfaceC56538yJb2, interfaceC56538yJb3, c50546vSk, c50546vSk2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C50546vSk KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56538yJb<java.lang.String> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56538yJb<java.lang.String> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            int iHashCode3 = this.KWHzl.hashCode();
            C50546vSk c50546vSk = this.AEQbTJ;
            int iHashCode4 = c50546vSk == null ? 0 : c50546vSk.hashCode();
            C50546vSk c50546vSk2 = this.OLrzqt;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (c50546vSk2 != null ? c50546vSk2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Values(estimatedRange=" + this.copydefault + ", defaultRange=" + this.EZpvd + ", limitRange=" + this.KWHzl + ", isXValid=" + this.AEQbTJ + ", isYValid=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb2, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb3, C50546vSk c50546vSk, C50546vSk c50546vSk2) {
            Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
            Intrinsics.checkNotNullParameter(interfaceC56538yJb2, "");
            Intrinsics.checkNotNullParameter(interfaceC56538yJb3, "");
            this.copydefault = interfaceC56538yJb;
            this.EZpvd = interfaceC56538yJb2;
            this.KWHzl = interfaceC56538yJb3;
            this.AEQbTJ = c50546vSk;
            this.OLrzqt = c50546vSk2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:o.yJb:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yJb:0x0006: INVOKE (""), ("") STATIC call: o.yJk.EZpvd(java.lang.Comparable, java.lang.Comparable):o.yJb A[MD:<T extends java.lang.Comparable<? super T>>:(T extends java.lang.Comparable<? super T>, T extends java.lang.Comparable<? super T>):o.yJb<T extends java.lang.Comparable<? super T>> (m), WRAPPED] (LINE:183)) : (r4v0 o.yJb))
  (wrap:o.yJb:0x0012: TERNARY null = ((wrap:int:0x000a: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yJb:0x000e: INVOKE (""), ("") STATIC call: o.yJk.EZpvd(java.lang.Comparable, java.lang.Comparable):o.yJb A[MD:<T extends java.lang.Comparable<? super T>>:(T extends java.lang.Comparable<? super T>, T extends java.lang.Comparable<? super T>):o.yJb<T extends java.lang.Comparable<? super T>> (m), WRAPPED] (LINE:184)) : (r5v0 o.yJb))
  (wrap:o.yJb:0x001b: TERNARY null = ((wrap:int:0x0013: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yJb:0x0017: INVOKE (""), ("") STATIC call: o.yJk.EZpvd(java.lang.Comparable, java.lang.Comparable):o.yJb A[MD:<T extends java.lang.Comparable<? super T>>:(T extends java.lang.Comparable<? super T>, T extends java.lang.Comparable<? super T>):o.yJb<T extends java.lang.Comparable<? super T>> (m), WRAPPED] (LINE:185)) : (r6v0 o.yJb))
  (wrap:o.vSk:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.vSk) : (r7v0 o.vSk))
  (wrap:o.vSk:?: TERNARY null = ((wrap:int:0x0024: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null o.vSk) : (r8v0 o.vSk))
 A[MD:(o.yJb<java.lang.String>, o.yJb<java.lang.String>, o.yJb<java.lang.String>, o.vSk, o.vSk):void (m)] (LINE:182) call: o.vSi.TaskDescription.<init>(o.yJb, o.yJb, o.yJb, o.vSk, o.vSk):void type: THIS */
        public /* synthetic */ TaskDescription(InterfaceC56538yJb interfaceC56538yJb, InterfaceC56538yJb interfaceC56538yJb2, InterfaceC56538yJb interfaceC56538yJb3, C50546vSk c50546vSk, C50546vSk c50546vSk2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C56547yJk.EZpvd("", "") : interfaceC56538yJb, (i & 2) != 0 ? C56547yJk.EZpvd("", "") : interfaceC56538yJb2, (i & 4) != 0 ? C56547yJk.EZpvd("", "") : interfaceC56538yJb3, (i & 8) != 0 ? null : c50546vSk, (i & 16) != 0 ? null : c50546vSk2);
        }
    }
}
