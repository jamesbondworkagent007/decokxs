package o;

import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_find.data.HotRankResponse;
import com.okinc.unify_find.data.NewCoinGroupResponse;
import com.okinc.unify_find.data.RankListRepository$initSpot$initTrade$1;
import com.okinc.unify_find.data.RankListRequestGroup;
import com.okinc.unify_find.data.UpDownRank;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvertKt;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xkr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55488xkr {
    public static final int EZpvd;
    public static final C55488xkr KWHzl = new C55488xkr();
    public static C55597xmu AEQbTJ = new C55597xmu();
    public static C55569xmS OLrzqt = new C55569xmS();
    public static C55596xmt copydefault = new C55596xmt();

    private C55488xkr() {
    }

    static {
        pWO.KWHzl().KWHzl(new InterfaceC54612xOv() { // from class: o.xkr.5
        });
        EZpvd = 8;
    }

    public static /* synthetic */ AbstractC58185ywX initSpot$default(C55488xkr c55488xkr, java.lang.Boolean bool, RankListRequestGroup rankListRequestGroup, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            rankListRequestGroup = null;
        }
        return c55488xkr.EZpvd(bool, rankListRequestGroup);
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlinx.coroutines.rx2.RxConvertKt.asFlowable$default(kotlinx.coroutines.flow.Flow, kotlin.coroutines.CoroutineContext, int, java.lang.Object):o.ywX */
    public final AbstractC58185ywX<java.lang.Boolean> EZpvd(java.lang.Boolean bool, RankListRequestGroup rankListRequestGroup) {
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = RxConvertKt.asFlowable$default(FlowKt.asFlow(new RankListRepository$initSpot$initTrade$1(bool, null)), null, 1, null).copydefault(C58266yxz.OLrzqt()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.ArrayList] */
    public AbstractC58185ywX<SourceResp<java.util.ArrayList<HotRankResponse>>> copydefault(@NotNull final RankListRequestGroup rankListRequestGroup, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(rankListRequestGroup, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new java.util.ArrayList();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        AbstractC58185ywX<SourceResp<java.util.ArrayList<HotRankResponse>>> abstractC58185ywXCopydefault = xUR.KWHzl(new InterfaceC58187ywZ() { // from class: o.xkQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C55488xkr.EZpvd(objectRef, objectRef2, bool, rankListRequestGroup, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.xkR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C55488xkr.EZpvd(objectRef2, objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX INFO: renamed from: o.xkr$Application */
    public static final class Application extends AbstractC55571xmU {
        public final /* synthetic */ InterfaceC58184ywW<SourceResp<java.util.ArrayList<HotRankResponse>>> KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(RankListRequestGroup rankListRequestGroup, InterfaceC58184ywW<SourceResp<java.util.ArrayList<HotRankResponse>>> interfaceC58184ywW, java.lang.String str) {
            super(rankListRequestGroup, str);
            this.KWHzl = interfaceC58184ywW;
        }

        @Override // o.AbstractC55571xmU
        public void EZpvd(java.lang.String str, java.util.ArrayList<HotRankResponse> arrayList) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.KWHzl.onNext(new SourceResp<>(java.lang.Boolean.TRUE, arrayList, null, 4, null));
        }

        @Override // o.AbstractC55571xmU
        public void AEQbTJ(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.KWHzl.onError(th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, o.yxC] */
    public static final void EZpvd(final Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, java.lang.Boolean bool, RankListRequestGroup rankListRequestGroup, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final Application application = new Application(rankListRequestGroup, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        ((java.util.ArrayList) objectRef.element).add(application);
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXEZpvd = KWHzl.EZpvd(bool, rankListRequestGroup);
        final Function1 function1 = new Function1() { // from class: o.xkN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55488xkr.AEQbTJ(objectRef, application, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xkM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C55488xkr.AkhnZx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.xkK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55488xkr.OLrzqt(application, (java.lang.Throwable) obj);
            }
        };
        objectRef2.element = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xkP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C55488xkr.values(function12, obj);
            }
        });
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(Ref.ObjectRef objectRef, Application application, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            KWHzl.EZpvd((java.util.ArrayList<java.lang.Object>) objectRef.element);
        } else {
            application.AEQbTJ(new java.lang.Exception(C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj)));
        }
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Application application, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        application.AEQbTJ(th);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        KWHzl.gEmmrt((java.util.ArrayList) objectRef2.element);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.ArrayList] */
    public AbstractC58185ywX<SourceResp<java.util.ArrayList<UpDownRank>>> OLrzqt(@NotNull final RankListRequestGroup rankListRequestGroup, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(rankListRequestGroup, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new java.util.ArrayList();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        AbstractC58185ywX<SourceResp<java.util.ArrayList<UpDownRank>>> abstractC58185ywXCopydefault = xUR.KWHzl(new InterfaceC58187ywZ() { // from class: o.xkA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C55488xkr.OLrzqt(objectRef, objectRef2, bool, rankListRequestGroup, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.xkE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C55488xkr.AYXKKw(objectRef2, objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX INFO: renamed from: o.xkr$FragmentManager */
    public static final class FragmentManager extends AbstractC55630xna {
        public final /* synthetic */ InterfaceC58184ywW<SourceResp<java.util.ArrayList<UpDownRank>>> OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(RankListRequestGroup rankListRequestGroup, InterfaceC58184ywW<SourceResp<java.util.ArrayList<UpDownRank>>> interfaceC58184ywW, java.lang.String str) {
            super(rankListRequestGroup, str);
            this.OLrzqt = interfaceC58184ywW;
        }

        @Override // o.AbstractC55573xmW
        public void OLrzqt(java.lang.String str, java.util.ArrayList<UpDownRank> arrayList) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.OLrzqt.onNext(new SourceResp<>(java.lang.Boolean.TRUE, arrayList, null, 4, null));
        }

        @Override // o.AbstractC55573xmW
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.OLrzqt.onError(th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, o.yxC] */
    public static final void OLrzqt(final Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, java.lang.Boolean bool, RankListRequestGroup rankListRequestGroup, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final FragmentManager fragmentManager = new FragmentManager(rankListRequestGroup, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        ((java.util.ArrayList) objectRef.element).add(fragmentManager);
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXEZpvd = KWHzl.EZpvd(bool, rankListRequestGroup);
        final Function1 function1 = new Function1() { // from class: o.xkw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55488xkr.KWHzl(objectRef, fragmentManager, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xkv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C55488xkr.isConnected(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.xkz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55488xkr.KWHzl(fragmentManager, (java.lang.Throwable) obj);
            }
        };
        objectRef2.element = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xkD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C55488xkr.AuCTel(function12, obj);
            }
        });
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(Ref.ObjectRef objectRef, FragmentManager fragmentManager, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            KWHzl.EZpvd((java.util.ArrayList<java.lang.Object>) objectRef.element);
        } else {
            fragmentManager.KWHzl(new java.lang.Exception(C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj)));
        }
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(FragmentManager fragmentManager, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        fragmentManager.KWHzl(th);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AYXKKw(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        KWHzl.gEmmrt((java.util.ArrayList) objectRef2.element);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.ArrayList] */
    public AbstractC58185ywX<SourceResp<java.util.ArrayList<UpDownRank>>> AEQbTJ(@NotNull final RankListRequestGroup rankListRequestGroup) {
        Intrinsics.checkNotNullParameter(rankListRequestGroup, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new java.util.ArrayList();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        AbstractC58185ywX<SourceResp<java.util.ArrayList<UpDownRank>>> abstractC58185ywXCopydefault = xUR.KWHzl(new InterfaceC58187ywZ() { // from class: o.xkC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C55488xkr.OLrzqt(objectRef, objectRef2, rankListRequestGroup, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.xkB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C55488xkr.OLrzqt(objectRef2, objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX INFO: renamed from: o.xkr$ActionBar */
    public static final class ActionBar extends AbstractC55570xmT {
        public final /* synthetic */ InterfaceC58184ywW<SourceResp<java.util.ArrayList<UpDownRank>>> EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(RankListRequestGroup rankListRequestGroup, InterfaceC58184ywW<SourceResp<java.util.ArrayList<UpDownRank>>> interfaceC58184ywW, java.lang.String str) {
            super(rankListRequestGroup, str);
            this.EZpvd = interfaceC58184ywW;
        }

        @Override // o.AbstractC55573xmW
        public void OLrzqt(java.lang.String str, java.util.ArrayList<UpDownRank> arrayList) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.EZpvd.onNext(new SourceResp<>(java.lang.Boolean.TRUE, arrayList, null, 4, null));
        }

        @Override // o.AbstractC55573xmW
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.EZpvd.onError(th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, o.yxC] */
    public static final void OLrzqt(final Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, RankListRequestGroup rankListRequestGroup, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final ActionBar actionBar = new ActionBar(rankListRequestGroup, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        ((java.util.ArrayList) objectRef.element).add(actionBar);
        AbstractC58185ywX abstractC58185ywXInitSpot$default = initSpot$default(KWHzl, null, rankListRequestGroup, 1, null);
        final Function1 function1 = new Function1() { // from class: o.xkI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55488xkr.KWHzl(objectRef, actionBar, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xkF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C55488xkr.valueOf(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.xkO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55488xkr.KWHzl(actionBar, (java.lang.Throwable) obj);
            }
        };
        objectRef2.element = abstractC58185ywXInitSpot$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xkL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C55488xkr.AhwBna(function12, obj);
            }
        });
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(Ref.ObjectRef objectRef, ActionBar actionBar, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            KWHzl.EZpvd((java.util.ArrayList<java.lang.Object>) objectRef.element);
        } else {
            actionBar.KWHzl(new java.lang.Exception(C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj)));
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ActionBar actionBar, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        actionBar.KWHzl(th);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        KWHzl.gEmmrt((java.util.ArrayList) objectRef2.element);
    }

    public AbstractC58185ywX<SourceResp<NewCoinGroupResponse>> AEQbTJ(@NotNull final RankListRequestGroup rankListRequestGroup, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(rankListRequestGroup, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<SourceResp<NewCoinGroupResponse>> abstractC58185ywXCopydefault = xUR.KWHzl(new InterfaceC58187ywZ() { // from class: o.xky
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C55488xkr.OLrzqt(arrayList, objectRef, bool, rankListRequestGroup, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.xkx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C55488xkr.AEQbTJ(objectRef, arrayList);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX INFO: renamed from: o.xkr$StateListAnimator */
    public static final class StateListAnimator extends AbstractC55574xmX {
        public final /* synthetic */ InterfaceC58184ywW<SourceResp<NewCoinGroupResponse>> copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(RankListRequestGroup rankListRequestGroup, InterfaceC58184ywW<SourceResp<NewCoinGroupResponse>> interfaceC58184ywW, java.lang.String str) {
            super(rankListRequestGroup, str);
            this.copydefault = interfaceC58184ywW;
        }

        @Override // o.AbstractC55574xmX
        public void KWHzl(java.lang.String str, NewCoinGroupResponse newCoinGroupResponse) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(newCoinGroupResponse, "");
            this.copydefault.onNext(new SourceResp<>(java.lang.Boolean.TRUE, newCoinGroupResponse, null, 4, null));
        }

        @Override // o.AbstractC55574xmX
        public void copydefault(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.copydefault.onError(th);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, o.yxC] */
    public static final void OLrzqt(final java.util.ArrayList arrayList, Ref.ObjectRef objectRef, java.lang.Boolean bool, RankListRequestGroup rankListRequestGroup, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final StateListAnimator stateListAnimator = new StateListAnimator(rankListRequestGroup, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        arrayList.add(stateListAnimator);
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXEZpvd = KWHzl.EZpvd(bool, rankListRequestGroup);
        final Function1 function1 = new Function1() { // from class: o.xkT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55488xkr.KWHzl(arrayList, stateListAnimator, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xkY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C55488xkr.fetchVPNInfo(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.xkV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55488xkr.OLrzqt(stateListAnimator, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xkU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C55488xkr.DbNXlk(function12, obj);
            }
        });
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.util.ArrayList arrayList, StateListAnimator stateListAnimator, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            KWHzl.EZpvd((java.util.ArrayList<java.lang.Object>) arrayList);
        } else {
            stateListAnimator.copydefault(new java.lang.Exception(C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj)));
        }
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(StateListAnimator stateListAnimator, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        stateListAnimator.copydefault(th);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Ref.ObjectRef objectRef, java.util.ArrayList arrayList) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        KWHzl.gEmmrt(arrayList);
    }

    public AbstractC58185ywX<SourceResp<java.util.ArrayList<FuturesRankItemPo>>> copydefault(@NotNull final RankListRequestGroup rankListRequestGroup) {
        Intrinsics.checkNotNullParameter(rankListRequestGroup, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC58185ywX<SourceResp<java.util.ArrayList<FuturesRankItemPo>>> abstractC58185ywXCopydefault = xUR.KWHzl(new InterfaceC58187ywZ() { // from class: o.xkJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C55488xkr.AEQbTJ(arrayList, rankListRequestGroup, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.xkS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C55488xkr.copydefault(arrayList);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX INFO: renamed from: o.xkr$TaskDescription */
    public static final class TaskDescription extends AbstractC55567xmQ {
        public final /* synthetic */ InterfaceC58184ywW<SourceResp<java.util.ArrayList<FuturesRankItemPo>>> copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(RankListRequestGroup rankListRequestGroup, InterfaceC58184ywW<SourceResp<java.util.ArrayList<FuturesRankItemPo>>> interfaceC58184ywW, java.lang.String str) {
            super(rankListRequestGroup, str);
            this.copydefault = interfaceC58184ywW;
        }

        @Override // o.AbstractC55567xmQ
        public void OLrzqt(java.lang.String str, java.util.ArrayList<FuturesRankItemPo> arrayList) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.copydefault.onNext(new SourceResp<>(java.lang.Boolean.TRUE, arrayList, null, 4, null));
        }

        @Override // o.AbstractC55567xmQ
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.copydefault.onError(th);
        }
    }

    public static final void AEQbTJ(java.util.ArrayList arrayList, RankListRequestGroup rankListRequestGroup, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        arrayList.add(new TaskDescription(rankListRequestGroup, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        KWHzl.EZpvd((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    public static final void copydefault(java.util.ArrayList arrayList) {
        KWHzl.gEmmrt(arrayList);
    }

    public AbstractC58185ywX<SourceResp<java.util.ArrayList<FuturesRankItemPo>>> EZpvd(@NotNull final RankListRequestGroup rankListRequestGroup) {
        Intrinsics.checkNotNullParameter(rankListRequestGroup, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC58185ywX<SourceResp<java.util.ArrayList<FuturesRankItemPo>>> abstractC58185ywXCopydefault = xUR.KWHzl(new InterfaceC58187ywZ() { // from class: o.xkH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C55488xkr.OLrzqt(arrayList, rankListRequestGroup, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.xkG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C55488xkr.AEQbTJ(arrayList);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX INFO: renamed from: o.xkr$Activity */
    public static final class Activity extends AbstractC55576xmZ {
        public final /* synthetic */ InterfaceC58184ywW<SourceResp<java.util.ArrayList<FuturesRankItemPo>>> KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(RankListRequestGroup rankListRequestGroup, InterfaceC58184ywW<SourceResp<java.util.ArrayList<FuturesRankItemPo>>> interfaceC58184ywW, java.lang.String str) {
            super(rankListRequestGroup, str);
            this.KWHzl = interfaceC58184ywW;
        }

        @Override // o.AbstractC55576xmZ
        public void OLrzqt(java.lang.String str, java.util.ArrayList<FuturesRankItemPo> arrayList) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.KWHzl.onNext(new SourceResp<>(java.lang.Boolean.TRUE, arrayList, null, 4, null));
        }

        @Override // o.AbstractC55576xmZ
        public void EZpvd(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.KWHzl.onError(th);
        }
    }

    public static final void OLrzqt(java.util.ArrayList arrayList, RankListRequestGroup rankListRequestGroup, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        arrayList.add(new Activity(rankListRequestGroup, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        KWHzl.EZpvd((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    public static final void AEQbTJ(java.util.ArrayList arrayList) {
        KWHzl.gEmmrt(arrayList);
    }

    public java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc0")) {
            return "utc0";
        }
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? "utc8" : "utc24";
    }

    public final void EZpvd(java.util.ArrayList<java.lang.Object> arrayList) {
        for (java.lang.Object obj : arrayList) {
            C33495mxY.OLrzqt("WS-TASK-CONTEXT", "add->" + (obj instanceof AbstractC55755xpt ? ((AbstractC55755xpt) obj).AEQbTJ() : obj.getClass().getName()));
        }
        OLrzqt.OLrzqt(arrayList);
    }

    public final void gEmmrt(java.util.ArrayList<java.lang.Object> arrayList) {
        for (java.lang.Object obj : arrayList) {
            C33495mxY.OLrzqt("WS-TASK-CONTEXT", "remove->" + (obj instanceof AbstractC55755xpt ? ((AbstractC55755xpt) obj).AEQbTJ() : obj.getClass().getName()));
        }
        OLrzqt.AEQbTJ(arrayList);
    }
}
