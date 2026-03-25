package o;

import android.graphics.Bitmap;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.okinc.rxutils.RxBus;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.platforms.SharePlatform;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.trade.experience.bridge.OKMarketBridgeEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$1;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.AbstractC58185ywX;
import o.C34929nli;
import o.C42716rbf;
import o.C49385unZ;
import o.C56391yDq;
import o.InterfaceC49363unD;
import o.InterfaceC58217yxC;
import o.jSA;
import o.pUU;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nli, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34929nli extends AbstractC48902ueT<ImageCustomPreviewConfig> implements InterfaceC49363unD {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public C42716rbf KWHzl;
    public final int copydefault = qZH.ActionBar.DBxZfM;

    /* JADX INFO: renamed from: o.nli$StateListAnimator */
    public static final class StateListAnimator extends C48900ueR {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C48900ueR, o.InterfaceC48898ueP
        public boolean AEQbTJ(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.nli$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nli.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, state, function2);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, state, function2);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>> java.lang.Object onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Flow<? extends T>> continuation) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, state, function2, continuation);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A> Flow<A> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B> Flow<kotlin.Pair<A, B>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49362unC
    public <T extends InterfaceC49369unJ<T>> Flow<T> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz);
    }

    /* JADX INFO: renamed from: o.nli$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        public static final Activity Companion = new Activity(null);

        @SerializedName("contentId")
        private final java.lang.String contentId;

        @SerializedName("status")
        private final int status;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = actionBar.contentId;
            }
            if ((i2 & 2) != 0) {
                i = actionBar.status;
            }
            return actionBar.OLrzqt(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.contentId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.contentId, (java.lang.Object) actionBar.contentId) && this.status == actionBar.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.contentId.hashCode() * 31) + java.lang.Integer.hashCode(this.status);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FeedDetailLoadStatus(contentId=" + this.contentId + ", status=" + this.status + ")";
        }

        public ActionBar(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            this.contentId = str;
            this.status = i;
        }

        /* JADX INFO: renamed from: o.nli$ActionBar$Activity */
        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nli.ActionBar.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = C42716rbf.OLrzqt(view);
        boolean z = requireShareParams().getExtras().getBoolean("isFixedSize", true);
        C42716rbf c42716rbf = this.KWHzl;
        if (c42716rbf == null) {
            Intrinsics.gEmmrt("");
            c42716rbf = null;
        }
        c42716rbf.EZpvd.setFixedSize$OKMarket_market_impl(z);
        setOnEditMenuClickListener(new StateListAnimator());
        OLrzqt();
        notifyPreviewFirstLoaded();
        java.lang.String string = requireShareParams().getExtras().getString("SHARE_SHORT_LINK");
        C42716rbf c42716rbf2 = this.KWHzl;
        if (c42716rbf2 == null) {
            Intrinsics.gEmmrt("");
            c42716rbf2 = null;
        }
        c42716rbf2.KWHzl.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.DzCpqu));
        pUU.KWHzl("qjf", "FeedDetailSharingContainerFragment-------shortLink = " + string);
        if (string != null) {
            C42716rbf c42716rbf3 = this.KWHzl;
            if (c42716rbf3 == null) {
                Intrinsics.gEmmrt("");
                c42716rbf3 = null;
            }
            c42716rbf3.KWHzl.setSubTitle(new Regex("^(http://|https://)").replace(string, ""));
            C42716rbf c42716rbf4 = this.KWHzl;
            if (c42716rbf4 == null) {
                Intrinsics.gEmmrt("");
                c42716rbf4 = null;
            }
            c42716rbf4.KWHzl.setQRCode(string);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt() {
        C49385unZ.ActionBar actionBar = C49385unZ.Companion;
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        final java.lang.String str = "market.feed_detail_load_event";
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.find_ui.features.community.sharing.FeedDetailSharingContainerFragment$listenLoadingEvent$$inlined$listen$1
            public InterfaceC58217yxC KWHzl;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onCreate(lifecycleOwner);
                AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C49385unZ.class, new String[0]);
                final String str2 = str;
                final C34929nli c34929nli = this;
                this.KWHzl = abstractC58185ywXAEQbTJ.AEQbTJ(new jSA.ContentResolver(new Function1<C49385unZ, Unit>() { // from class: com.okinc.find_ui.features.community.sharing.FeedDetailSharingContainerFragment$listenLoadingEvent$$inlined$listen$1.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(C49385unZ c49385unZ) {
                        KWHzl(c49385unZ);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void KWHzl(C49385unZ c49385unZ) {
                        Object objM7377constructorimpl;
                        C49385unZ c49385unZ2 = c49385unZ;
                        pUU.OLrzqt("OKMarketBridgeEvent listened: " + c49385unZ2);
                        if (Intrinsics.EZpvd((Object) c49385unZ2.OLrzqt(), (Object) str2)) {
                            C49385unZ.ActionBar actionBar2 = C49385unZ.Companion;
                            String strEZpvd = c49385unZ2.EZpvd();
                            C42716rbf c42716rbf = null;
                            C42716rbf c42716rbf2 = null;
                            C42716rbf c42716rbf3 = null;
                            if (strEZpvd == null || strEZpvd.length() == 0) {
                                objM7377constructorimpl = null;
                            } else {
                                try {
                                    Result.Application application = Result.Companion;
                                    objM7377constructorimpl = new Gson().fromJson(strEZpvd, new TypeToken<C34929nli.ActionBar>() { // from class: com.okinc.find_ui.features.community.sharing.FeedDetailSharingContainerFragment$listenLoadingEvent$.inlined.listen.1.1.2
                                    }.getType());
                                } catch (Throwable th) {
                                    Result.Application application2 = Result.Companion;
                                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                                    }
                                }
                            }
                            C34929nli.ActionBar actionBar3 = (C34929nli.ActionBar) objM7377constructorimpl;
                            String string = c34929nli.requireShareParams().getExtras().getString("id");
                            if (!Intrinsics.EZpvd((Object) string, (Object) (actionBar3 != null ? actionBar3.KWHzl() : null))) {
                                pUU.EZpvd(c34929nli.getTag(), "contentId: " + (actionBar3 != null ? actionBar3.KWHzl() : null) + " not match, ignore");
                                return;
                            }
                            pUU.EZpvd(c34929nli.getTag(), "FeedDetailLoadStatus listened: " + actionBar3 + ", contentId: " + string);
                            Integer numValueOf = actionBar3 != null ? Integer.valueOf(actionBar3.copydefault()) : null;
                            if (numValueOf != null && numValueOf.intValue() == 0) {
                                C42716rbf c42716rbf4 = c34929nli.KWHzl;
                                if (c42716rbf4 == null) {
                                    Intrinsics.gEmmrt("");
                                } else {
                                    c42716rbf2 = c42716rbf4;
                                }
                                c42716rbf2.EZpvd.setInterceptTouchEvent$OKMarket_market_impl(true);
                                return;
                            }
                            if (numValueOf != null && numValueOf.intValue() == 1) {
                                C42716rbf c42716rbf5 = c34929nli.KWHzl;
                                if (c42716rbf5 == null) {
                                    Intrinsics.gEmmrt("");
                                } else {
                                    c42716rbf3 = c42716rbf5;
                                }
                                c42716rbf3.EZpvd.setInterceptTouchEvent$OKMarket_market_impl(true);
                                return;
                            }
                            if (numValueOf != null && numValueOf.intValue() == 2) {
                                C42716rbf c42716rbf6 = c34929nli.KWHzl;
                                if (c42716rbf6 == null) {
                                    Intrinsics.gEmmrt("");
                                } else {
                                    c42716rbf = c42716rbf6;
                                }
                                c42716rbf.EZpvd.setInterceptTouchEvent$OKMarket_market_impl(false);
                            }
                        }
                    }
                }), new jSA.ContentResolver(OKMarketBridgeEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$1.AnonymousClass5.KWHzl));
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onDestroy(lifecycleOwner);
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: onRequestPendingShareParams(Lcom/okinc/share/platforms/SharePlatform;)Lcom/okinc/share/api/params/IShareParams; */
    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ImageShareParams onRequestPendingShareParams(@NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        ImageShareParams imageShareParams = (ImageShareParams) super.onRequestPendingShareParams(sharePlatform);
        java.lang.String pendingShareImagePath = imageShareParams.getPendingShareImagePath();
        if (pendingShareImagePath == null) {
            pendingShareImagePath = copydefault();
        }
        imageShareParams.setPendingShareImagePath(pendingShareImagePath);
        return imageShareParams;
    }

    public static final android.graphics.Bitmap KWHzl(android.view.View view) {
        pUU.KWHzl("qjf", "enhanceBuildCompositePreviewImagePath--view.width = " + view.getWidth() + "，view.height=" + view.getHeight());
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        view.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public final java.lang.String copydefault() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            java.io.File fileSavePendingShareBitmapFile = savePendingShareBitmapFile(KWHzl(getPreviewContainer()));
            objM7377constructorimpl = Result.m7377constructorimpl(fileSavePendingShareBitmapFile != null ? fileSavePendingShareBitmapFile.getAbsolutePath() : null);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    @Override // o.AbstractC48908ueZ
    public android.graphics.Rect getPreviewBounds() {
        android.graphics.Rect rect = new android.graphics.Rect();
        getPreviewContainer().getDrawingRect(rect);
        rect.offsetTo(0, 0);
        return rect;
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.graphics.Rect getImageBounds() {
        return getPreviewBounds();
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.view.ViewGroup getPreviewContainer() {
        C42716rbf c42716rbf = this.KWHzl;
        if (c42716rbf == null) {
            Intrinsics.gEmmrt("");
            c42716rbf = null;
        }
        C34932nll c34932nll = c42716rbf.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c34932nll, "");
        return c34932nll;
    }
}
