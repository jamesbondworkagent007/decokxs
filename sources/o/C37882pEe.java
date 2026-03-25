package o;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.MutableLiveData;
import com.okinc.core.util.SPUtils;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.biz.subscribe.BizDepthData;
import com.okinc.unify_trade.biz.subscribe.DepthItem;
import io.reactivex.BackpressureStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C37882pEe;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pEe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37882pEe extends AbstractC54517xLi {
    public BizDepthData EZpvd;
    public InterfaceC58217yxC KWHzl;
    public BizInstrument copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public java.lang.String OLrzqt = "";
    public java.lang.String AhwBna = "";
    public int AYXKKw = -1;

    @Override // o.AbstractC54517xLi
    public void copydefault(Function1<? super java.lang.Boolean, Unit> function1) {
    }

    /* JADX INFO: renamed from: o.pEe$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pEe.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C37882pEe AEQbTJ() {
            return new C37882pEe();
        }

        public final java.lang.String OLrzqt(@NotNull BizInstrument bizInstrument) {
            InterfaceC54577xNn interfaceC54577xNn;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            xOW newProxyInstance;
            MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
            ValuationCurrencyData value;
            Intrinsics.checkNotNullParameter(bizInstrument, "");
            java.lang.String instId = bizInstrument.getInstId();
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            return instId + "_" + ((interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null) ? null : value.getIsoCode()) + "_ladder";
        }

        public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            BizInstrument suggestedInstrument$default;
            InterfaceC54577xNn interfaceC54577xNn;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
            AbstractC54531xLw abstractC54531xLwOLrzqt;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM != null) {
                TradeKey tradeKey = TradeKey.MANAGER;
                InterfaceC54577xNn interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(tradeKey);
                if (interfaceC54577xNn2 != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn2.OLrzqt()) != null && (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) != null) {
                    InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    java.util.List<java.lang.String> listKWHzl = (interfaceC49425uoM2 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(tradeKey)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(suggestedInstrument$default.getInstType())) == null) ? null : abstractC54531xLwOLrzqt.KWHzl(suggestedInstrument$default);
                    java.lang.String str3 = (listKWHzl == null || !(listKWHzl.isEmpty() ^ true)) ? "0.1" : listKWHzl.get(0);
                    java.lang.String string = SPUtils.getString(OLrzqt(suggestedInstrument$default), str3);
                    if (listKWHzl == null || !listKWHzl.contains(string)) {
                        return str3;
                    }
                    Intrinsics.copydefault((java.lang.Object) string);
                    return string;
                }
            }
            return "";
        }
    }

    public void EZpvd() {
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.OLrzqt = "";
    }

    public static /* synthetic */ void subDepth$default(C37882pEe c37882pEe, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            z = false;
        }
        c37882pEe.EZpvd(str, str2, str3, i, z, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.okinc.unify_trade.biz.BizInstrument] */
    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final java.lang.String str3, final int i, final boolean z, @NotNull final Function1<? super TaskDescription, Unit> function1) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        ?? suggestedInstrument$default;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null) {
            TradeKey tradeKey = TradeKey.MANAGER;
            InterfaceC54577xNn interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(tradeKey);
            if (interfaceC54577xNn2 == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn2.OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) == 0) {
                return;
            }
            objectRef.element = suggestedInstrument$default;
            if (suggestedInstrument$default.getMinSize().length() == 0) {
                InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                if (interfaceC49425uoM2 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(tradeKey)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(str2)) == null) {
                    return;
                }
                abstractC54531xLwOLrzqt.AEQbTJ((BizInstrument) objectRef.element, new Function1() { // from class: o.pEl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C37882pEe.copydefault(str2, str, this, objectRef, str3, i, z, function1, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
                return;
            }
            copydefault((BizInstrument) objectRef.element, str3, i, z, function1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, com.okinc.unify_trade.biz.BizInstrument] */
    public static final Unit copydefault(java.lang.String str, java.lang.String str2, C37882pEe c37882pEe, Ref.ObjectRef objectRef, java.lang.String str3, int i, boolean z, Function1 function1, boolean z2) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        ?? suggestedInstrument$default;
        if (z2) {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null)) != 0) {
                objectRef.element = suggestedInstrument$default;
            }
            c37882pEe.copydefault((BizInstrument) objectRef.element, str3, i, z, function1);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void handleBizData$default(C37882pEe c37882pEe, BizInstrument bizInstrument, java.lang.String str, int i, boolean z, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        c37882pEe.copydefault(bizInstrument, str, i, z, function1);
    }

    public final void copydefault(final BizInstrument bizInstrument, java.lang.String str, int i, boolean z, final Function1<? super TaskDescription, Unit> function1) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        if (this.AYXKKw == -1) {
            this.AYXKKw = i;
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        java.util.List<java.lang.String> listKWHzl = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(bizInstrument.getInstType())) == null) ? null : abstractC54531xLwOLrzqt.KWHzl(bizInstrument);
        if (str == null) {
            str = "0";
            java.lang.String string = SPUtils.getString(Companion.OLrzqt(bizInstrument), (listKWHzl == null || !(listKWHzl.isEmpty() ^ true)) ? "0" : listKWHzl.get(0));
            if (string != null) {
                str = string;
            }
        } else if (!z) {
            SPUtils.put(Companion.OLrzqt(bizInstrument), str);
        }
        this.AhwBna = str;
        if (Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) bizInstrument.getInstId()) || !C33129mqd.AEQbTJ(this.AhwBna, 0) || listKWHzl == null || !listKWHzl.contains(this.AhwBna)) {
            return;
        }
        this.OLrzqt = bizInstrument.getInstId();
        this.copydefault = bizInstrument;
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.pEj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C37882pEe.OLrzqt(bizInstrument, this, interfaceC58184ywW);
            }
        }, BackpressureStrategy.LATEST).copydefault(C58266yxz.OLrzqt()).KWHzl(yBP.KWHzl());
        final Function1 function12 = new Function1() { // from class: o.pEh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37882pEe.AEQbTJ(this.OLrzqt, bizInstrument, (BizDepthData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.pEk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C37882pEe.AEQbTJ(function12, obj);
            }
        }).KWHzl(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.pEg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37882pEe.OLrzqt(function1, (C37882pEe.TaskDescription) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.pEi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C37882pEe.OLrzqt(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.pEo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37882pEe.EZpvd((java.lang.Throwable) obj);
            }
        };
        this.KWHzl = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.pEm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C37882pEe.gEmmrt(function14, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.pEe$Activity */
    public static final class Activity extends AbstractC55663xoG {
        public final /* synthetic */ InterfaceC58184ywW<BizDepthData> EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(InterfaceC58184ywW<BizDepthData> interfaceC58184ywW, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(str, str2, str3);
            this.EZpvd = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(BizDepthData bizDepthData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(bizDepthData, "");
            Intrinsics.checkNotNullParameter(str, "");
            C37882pEe.this.EZpvd = bizDepthData;
            if (this.EZpvd.isCancelled()) {
                return;
            }
            this.EZpvd.onNext(bizDepthData);
        }
    }

    public static final void OLrzqt(BizInstrument bizInstrument, C37882pEe c37882pEe, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final Activity activity = c37882pEe.new Activity(interfaceC58184ywW, bizInstrument.getInstId(), c37882pEe.AhwBna, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
            interfaceC54581xNrOLrzqt.copydefault(yDY.copydefault(activity));
        }
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.pEc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                C37882pEe.AEQbTJ(activity);
            }
        });
    }

    public static final void AEQbTJ(Activity activity) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(yDY.copydefault(activity));
    }

    public static final TaskDescription AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (TaskDescription) function1.invoke(obj);
    }

    public static final TaskDescription AEQbTJ(C37882pEe c37882pEe, BizInstrument bizInstrument, BizDepthData bizDepthData) {
        Intrinsics.checkNotNullParameter(bizDepthData, "");
        return c37882pEe.EZpvd(bizInstrument, bizDepthData, c37882pEe.AhwBna, c37882pEe.AYXKKw);
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, TaskDescription taskDescription) {
        Intrinsics.copydefault(taskDescription);
        function1.invoke(taskDescription);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    public final TaskDescription EZpvd(BizInstrument bizInstrument, BizDepthData bizDepthData, java.lang.String str, int i) {
        int size = i;
        TaskDescription taskDescription = new TaskDescription(bizInstrument.getInstId(), bizInstrument.getInstType());
        if (bizInstrument.getInstId().length() == 0 || bizInstrument.getInstType().length() == 0) {
            return taskDescription;
        }
        int size2 = bizDepthData.getAsks().size() > size ? size : bizDepthData.getAsks().size();
        for (int i2 = 0; i2 < size2; i2++) {
            DepthItem depthItem = bizDepthData.getAsks().get(i2);
            Intrinsics.checkNotNullExpressionValue(depthItem, "");
            taskDescription.KWHzl().add(createItem$default(this, bizInstrument, depthItem, str, false, 8, null));
        }
        if (bizDepthData.getBids().size() <= size) {
            size = bizDepthData.getBids().size();
        }
        for (int i3 = 0; i3 < size; i3++) {
            DepthItem depthItem2 = bizDepthData.getBids().get(i3);
            Intrinsics.checkNotNullExpressionValue(depthItem2, "");
            taskDescription.OLrzqt().add(EZpvd(bizInstrument, depthItem2, str, true));
        }
        return taskDescription;
    }

    public static /* synthetic */ pAQ createItem$default(C37882pEe c37882pEe, BizInstrument bizInstrument, DepthItem depthItem, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c37882pEe.EZpvd(bizInstrument, depthItem, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pAQ EZpvd(BizInstrument bizInstrument, DepthItem depthItem, java.lang.String str, boolean z) {
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLEZpvd;
        java.lang.String safeString$default;
        C54571xNh c54571xNhAhwBna;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLAEQbTJ2;
        C54536xML c54536xMLEZpvd2;
        xMS xmsGEmmrt;
        xMS xmsGEmmrt2;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        java.lang.String strCopydefault = null;
        AbstractC54531xLw abstractC54531xLwOLrzqt2 = (interfaceC49425uoM == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) == null) ? null : interfaceC54581xNrOLrzqt2.OLrzqt(bizInstrument.getInstType());
        java.lang.String strAhwBna = (abstractC54531xLwOLrzqt2 == null || (xmsGEmmrt2 = abstractC54531xLwOLrzqt2.gEmmrt(bizInstrument.getInstFamily())) == null) ? null : xmsGEmmrt2.AhwBna(depthItem.getPrice());
        C54536xML c54536xMLKWHzl = (abstractC54531xLwOLrzqt2 == null || (xmsGEmmrt = abstractC54531xLwOLrzqt2.gEmmrt(bizInstrument.getInstFamily())) == null) ? null : xmsGEmmrt.KWHzl(C33129mqd.OLrzqt((java.lang.Object) strAhwBna));
        if (z) {
            safeString$default = (c54536xMLKWHzl == null || (c54536xMLCopydefault = c54536xMLKWHzl.copydefault()) == null || (c54536xMLAEQbTJ2 = c54536xMLCopydefault.AEQbTJ(true)) == null || (c54536xMLEZpvd2 = c54536xMLAEQbTJ2.EZpvd(java.lang.String.valueOf(C54803xVx.digitFormat$default(str, 0, 1, null)))) == null) ? null : C54536xML.toSafeString$default(c54536xMLEZpvd2, false, 1, null);
        } else if (c54536xMLKWHzl != null && (c54536xMLAuCTel = c54536xMLKWHzl.AuCTel()) != null && (c54536xMLAEQbTJ = c54536xMLAuCTel.AEQbTJ(true)) != null && (c54536xMLEZpvd = c54536xMLAEQbTJ.EZpvd(java.lang.String.valueOf(C54803xVx.digitFormat$default(str, 0, 1, null)))) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLEZpvd, false, 1, null);
        }
        java.lang.String roundToFixed$default = pTB.formatRoundToFixed$default(C33129mqd.EZpvd(safeString$default), C54803xVx.digitFormat$default(str, 0, 1, null), null, 2, null);
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Double.valueOf(C33129mqd.AEQbTJ(depthItem.getPrice())), (java.lang.Object) 0) && C33129mqd.AhwBna(java.lang.Double.valueOf(C33129mqd.AEQbTJ(depthItem.getAmount())), 0)) {
            roundToFixed$default = "<" + xMR.copydefault.copydefault(str);
        }
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default = (interfaceC49425uoM2 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(bizInstrument.getInstType())) == null) ? null : AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, bizInstrument.getInstFamily(), null, 2, null);
        if (c54571xNhCreateTradeConverterWithIndex$default != null && (c54571xNhAhwBna = c54571xNhCreateTradeConverterWithIndex$default.AhwBna(depthItem.getPrice())) != null) {
            strCopydefault = c54571xNhAhwBna.copydefault(depthItem.getAmount());
        }
        java.lang.String strAEQbTJ = C37893pEp.AEQbTJ(C33129mqd.AEQbTJ(strCopydefault), KWHzl(C33129mqd.AEQbTJ(strCopydefault), bizInstrument));
        pAQ paq = new pAQ(null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 0.0f, 63, null);
        paq.EZpvd(roundToFixed$default);
        paq.copydefault(C33129mqd.AEQbTJ(strAhwBna));
        if (safeString$default == null) {
            safeString$default = "";
        }
        paq.copydefault(safeString$default);
        paq.AEQbTJ(C33129mqd.AEQbTJ(depthItem.getAmount()));
        paq.OLrzqt(strAEQbTJ);
        return paq;
    }

    public final int KWHzl(double d, BizInstrument bizInstrument) {
        return ((InterfaceC49431uoS) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.DEPTH)).KWHzl(java.lang.Double.valueOf(d), bizInstrument.getInstType(), bizInstrument.getInstId());
    }

    /* JADX INFO: renamed from: o.pEe$TaskDescription */
    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AhwBna;
        public final BizInstrument EZpvd;
        public java.util.ArrayList<pAQ> KWHzl;
        public final AbstractC54531xLw OLrzqt;
        public java.util.ArrayList<pAQ> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<pAQ> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<pAQ> OLrzqt() {
            return this.copydefault;
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            InterfaceC54577xNn interfaceC54577xNn;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            InterfaceC54577xNn interfaceC54577xNn2;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.AhwBna = str2;
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            AbstractC54531xLw abstractC54531xLwOLrzqt = null;
            this.EZpvd = (interfaceC49425uoM == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) == null) ? null : InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, str2, str, null, null, 12, null);
            InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM2 != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
                abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2);
            }
            this.OLrzqt = abstractC54531xLwOLrzqt;
            this.KWHzl = new java.util.ArrayList<>();
            this.copydefault = new java.util.ArrayList<>();
        }
    }
}
