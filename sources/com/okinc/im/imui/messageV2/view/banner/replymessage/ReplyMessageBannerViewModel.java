package com.okinc.im.imui.messageV2.view.banner.replymessage;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.messageV2.view.banner.replymessage.ReplyMessageBannerViewModel;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C35818oEv;
import o.C37721ozF;
import o.C44373sNk;
import o.C44464sQu;
import o.sKD;
import o.sKH;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ReplyMessageBannerViewModel extends ViewModel {
    public final sKD AEQbTJ;
    public final LiveData<ActionBar> AYXKKw;
    public final MutableLiveData<String> EZpvd;
    public final Application KWHzl;
    public final sKH OLrzqt;
    public final MutableSharedFlow<Unit> copydefault;
    public final C35818oEv djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ActionBar> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<Unit> KWHzl() {
        return this.copydefault;
    }

    @yCM
    public ReplyMessageBannerViewModel(@NotNull C35818oEv c35818oEv, @NotNull sKD skd, @NotNull sKH skh) {
        Intrinsics.checkNotNullParameter(c35818oEv, "");
        Intrinsics.checkNotNullParameter(skd, "");
        Intrinsics.checkNotNullParameter(skh, "");
        this.djBIcL = c35818oEv;
        this.AEQbTJ = skd;
        this.OLrzqt = skh;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>(null);
        this.EZpvd = mutableLiveData;
        this.copydefault = C37721ozF.AEQbTJ();
        this.AYXKKw = Transformations.switchMap(mutableLiveData, new Function1() { // from class: o.ohZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ReplyMessageBannerViewModel.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        });
        this.KWHzl = new Application();
    }

    public static final LiveData KWHzl(final ReplyMessageBannerViewModel replyMessageBannerViewModel, String str) {
        if (str == null) {
            return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new ReplyMessageBannerViewModel$referenceMessageData$1$1(null), 3, (Object) null);
        }
        return Transformations.switchMap(FlowLiveDataConversions.asLiveData$default(replyMessageBannerViewModel.djBIcL.EZpvd(str), (CoroutineContext) null, 0L, 3, (Object) null), new Function1() { // from class: o.oia
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ReplyMessageBannerViewModel.KWHzl(this.OLrzqt, (OKMessage) obj);
            }
        });
    }

    public static final LiveData KWHzl(ReplyMessageBannerViewModel replyMessageBannerViewModel, OKMessage oKMessage) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new ReplyMessageBannerViewModel$referenceMessageData$1$2$1(oKMessage, replyMessageBannerViewModel, null), 3, (Object) null);
    }

    public static final class Application extends C44373sNk {
        public Application() {
        }

        @Override // o.C44373sNk, o.InterfaceC44291sKj
        public void EZpvd(C44464sQu c44464sQu) {
            OKMessage oKMessageKWHzl;
            OKMessage oKMessageKWHzl2;
            Intrinsics.checkNotNullParameter(c44464sQu, "");
            ActionBar value = ReplyMessageBannerViewModel.this.AEQbTJ().getValue();
            if (value == null || (oKMessageKWHzl = value.KWHzl()) == null || c44464sQu.AEQbTJ().getSeq() != oKMessageKWHzl.getSeq()) {
                return;
            }
            String targetId = c44464sQu.AEQbTJ().getTargetId();
            ActionBar value2 = ReplyMessageBannerViewModel.this.AEQbTJ().getValue();
            if (Intrinsics.EZpvd((Object) targetId, (Object) ((value2 == null || (oKMessageKWHzl2 = value2.KWHzl()) == null) ? null : oKMessageKWHzl2.getTargetId()))) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(ReplyMessageBannerViewModel.this), null, null, new ReplyMessageBannerViewModel$messageEventListener$1$onRecallEvent$1(ReplyMessageBannerViewModel.this, null), 3, null);
            }
        }
    }

    public final void KWHzl(String str) {
        this.EZpvd.setValue(str);
        sKD skd = this.AEQbTJ;
        skd.AEQbTJ(this.KWHzl);
        skd.OLrzqt(this.KWHzl);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.AEQbTJ.AEQbTJ(this.KWHzl);
    }

    public static final class ActionBar {
        public static final int OLrzqt = OKMessage.$stable;
        public final OKMessage AEQbTJ;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, OKMessage oKMessage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                oKMessage = actionBar.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str = actionBar.copydefault;
            }
            return actionBar.OLrzqt(oKMessage, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKMessage KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull OKMessage oKMessage, String str) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            return new ActionBar(oKMessage, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            String str = this.copydefault;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ReferenceMessageDisplayData(message=" + this.AEQbTJ + ", displayName=" + this.copydefault + ")";
        }

        public ActionBar(@NotNull OKMessage oKMessage, String str) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            this.AEQbTJ = oKMessage;
            this.copydefault = str;
        }
    }
}
