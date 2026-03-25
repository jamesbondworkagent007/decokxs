package o;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.okinc.market.search.features.navigation.root.ui.NavSearchRootFragment;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinInfo;
import com.okinc.unify_trade.biz.DeriConfigData;
import java.lang.ref.WeakReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.C40175qMc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qTj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40371qTj extends AbstractC43215rlA implements InterfaceC49508upq {
    public C40175qMc EZpvd;
    public WeakReference<InterfaceC48913uee> copydefault;
    public final java.lang.String OLrzqt = "com.okinc.search.newsearch.SearchRootFragment";
    public java.lang.String AEQbTJ = "com.okinc.search.newsearch.NavigationSelectFragment";

    @Override // o.InterfaceC49508upq
    public androidx.fragment.app.Fragment copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map, java.lang.Boolean bool, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        NavSearchRootFragment navSearchRootFragmentCopydefault = NavSearchRootFragment.Companion.copydefault(str, str5 == null ? str2 : str5, str3, str4, (64 & 16) != 0 ? null : null, (64 & 32) != 0 ? null : map, (64 & 64) != 0 ? java.lang.Boolean.FALSE : bool);
        C40383qTv.AEQbTJ("page_trade");
        this.copydefault = new WeakReference<>(navSearchRootFragmentCopydefault);
        return navSearchRootFragmentCopydefault;
    }

    @Override // o.InterfaceC49508upq
    public androidx.fragment.app.Fragment KWHzl(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        NavSearchRootFragment navSearchRootFragmentEZpvd = NavSearchRootFragment.Companion.EZpvd(str, str2, str3, map, bool);
        C40383qTv.AEQbTJ("page_trade");
        this.copydefault = new WeakReference<>(navSearchRootFragmentEZpvd);
        return navSearchRootFragmentEZpvd;
    }

    @Override // o.InterfaceC49508upq
    public androidx.fragment.app.Fragment KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        NavSearchRootFragment navSearchRootFragmentCopydefault = NavSearchRootFragment.Companion.copydefault(str, str2, str3, str4, (64 & 16) != 0 ? null : str5, (64 & 32) != 0 ? null : map, (64 & 64) != 0 ? java.lang.Boolean.FALSE : null);
        C40383qTv.AEQbTJ("page_trade");
        this.copydefault = new WeakReference<>(navSearchRootFragmentCopydefault);
        return navSearchRootFragmentCopydefault;
    }

    @Override // o.InterfaceC49508upq
    public void KWHzl(@NotNull final Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        InterfaceC48913uee interfaceC48913uee;
        Intrinsics.checkNotNullParameter(function2, "");
        WeakReference<InterfaceC48913uee> weakReference = this.copydefault;
        if (weakReference == null || (interfaceC48913uee = weakReference.get()) == null) {
            return;
        }
        interfaceC48913uee.copydefault(new Function1() { // from class: o.qTm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40371qTj.copydefault(function2, obj);
            }
        });
    }

    public static final Unit copydefault(Function2 function2, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof CoinInfo) {
            CoinInfo coinInfo = (CoinInfo) obj;
            function2.invoke(coinInfo.getIntId(), coinInfo.getIntType());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.fragment.app.Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC49508upq
    public void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull androidx.fragment.app.FragmentManager fragmentManager, final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (fragment instanceof InterfaceC48913uee) {
            InterfaceC48913uee interfaceC48913uee = (InterfaceC48913uee) fragment;
            interfaceC48913uee.AEQbTJ(fragmentManager, this.OLrzqt);
            interfaceC48913uee.EZpvd(new Function1() { // from class: o.qTk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40371qTj.AEQbTJ(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit AEQbTJ(Function1 function1, boolean z) {
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC49508upq
    public void OLrzqt(final Function0<Unit> function0) {
        InterfaceC48913uee interfaceC48913uee;
        WeakReference<InterfaceC48913uee> weakReference = this.copydefault;
        if (weakReference == null || (interfaceC48913uee = weakReference.get()) == null) {
            return;
        }
        interfaceC48913uee.copydefault(new Function0() { // from class: o.qTl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40371qTj.AEQbTJ(function0);
            }
        });
    }

    public static final Unit AEQbTJ(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC49508upq
    public androidx.fragment.app.Fragment EZpvd(java.lang.String str, Function1<? super java.lang.String, Unit> function1) {
        if (function1 != null) {
            this.EZpvd = C40175qMc.Companion.OLrzqt(str, function1);
        } else {
            this.EZpvd = C40175qMc.TaskDescription.newInstance$default(C40175qMc.Companion, str, null, 2, null);
        }
        C40175qMc c40175qMc = this.EZpvd;
        Intrinsics.copydefault(c40175qMc, "");
        return c40175qMc;
    }

    @Override // o.InterfaceC49508upq
    public void copydefault(@NotNull androidx.fragment.app.Fragment fragment, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        C40175qMc c40175qMc;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (!(fragment instanceof C40175qMc) || (c40175qMc = this.EZpvd) == null) {
            return;
        }
        c40175qMc.show(fragmentManager, this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.qTj$Activity */
    public static final class Activity implements InterfaceC55701xos<java.util.List<? extends DeriConfigData>> {
        public final /* synthetic */ InterfaceC49503upl OLrzqt;

        public Activity(InterfaceC49503upl interfaceC49503upl) {
            this.OLrzqt = interfaceC49503upl;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<DeriConfigData> list, java.lang.Exception exc) {
            InterfaceC49503upl interfaceC49503upl = this.OLrzqt;
            if (interfaceC49503upl != null) {
                Intrinsics.copydefault(list, "");
                interfaceC49503upl.EZpvd(z, list, exc);
            }
        }
    }

    @Override // o.InterfaceC49508upq
    public InterfaceC58217yxC OLrzqt(InterfaceC49503upl interfaceC49503upl) {
        C56087xwG c56087xwGZLjUOn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (c56087xwGZLjUOn = interfaceC54581xNrOLrzqt.zLjUOn()) == null) {
            return null;
        }
        return c56087xwGZLjUOn.KWHzl(new Activity(interfaceC49503upl));
    }

    @Override // o.InterfaceC49508upq
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Continuation<? super BizInstrument> continuation) {
        java.lang.Object objM7377constructorimpl;
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "OPTION")) {
            throw new java.lang.IllegalStateException("not support instType:" + str);
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            Result.Application application = Result.Companion;
            InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
            objM7377constructorimpl = Result.m7377constructorimpl(interfaceC43033rhe != null ? C56443yFo.KWHzl(interfaceC43033rhe.copydefault(fragmentManager, new StateListAnimator(cancellableContinuationImpl))) : null);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null && cancellableContinuationImpl.isActive()) {
            Result.Application application3 = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m7377constructorimpl(null));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    /* JADX INFO: renamed from: o.qTj$StateListAnimator */
    public static final class StateListAnimator implements Function1<BizInstrument, Unit> {
        public final /* synthetic */ CancellableContinuation<BizInstrument> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super com.okinc.unify_trade.biz.BizInstrument> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CancellableContinuation<? super BizInstrument> cancellableContinuation) {
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(BizInstrument bizInstrument) {
            AEQbTJ(bizInstrument);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(BizInstrument bizInstrument) {
            if (this.EZpvd.isActive()) {
                CancellableContinuation<BizInstrument> cancellableContinuation = this.EZpvd;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(bizInstrument));
            }
        }
    }

    @Override // o.InterfaceC48910ueb
    public BottomSheetDialogFragment OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return NavSearchRootFragment.Companion.copydefault(str, str5 == null ? str2 : str5, str3, str4, (64 & 16) != 0 ? null : null, (64 & 32) != 0 ? null : map, (64 & 64) != 0 ? java.lang.Boolean.FALSE : null);
    }
}
