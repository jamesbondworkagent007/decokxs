package com.okinc.im.imui.messageV2.view.banner.scamannouncement;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.messageV2.view.banner.scamannouncement.ScamAnnouncementBannerViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35753oCk;
import o.C35756oCn;
import o.C36559odJ;
import o.C56391yDq;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ScamAnnouncementBannerViewModel extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final C35753oCk AEQbTJ;
    public final LiveData<C36559odJ> AhwBna;
    public final MutableLiveData<String> EZpvd;
    public final C35756oCn KWHzl;
    public IMPageType copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C36559odJ> AEQbTJ() {
        return this.AhwBna;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.banner.scamannouncement.ScamAnnouncementBannerViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @yCM
    public ScamAnnouncementBannerViewModel(@NotNull C35753oCk c35753oCk, @NotNull C35756oCn c35756oCn) {
        Intrinsics.checkNotNullParameter(c35753oCk, "");
        Intrinsics.checkNotNullParameter(c35756oCn, "");
        this.AEQbTJ = c35753oCk;
        this.KWHzl = c35756oCn;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.EZpvd = mutableLiveData;
        this.AhwBna = Transformations.distinctUntilChanged(Transformations.switchMap(mutableLiveData, new Function1() { // from class: o.oil
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ScamAnnouncementBannerViewModel.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        }));
    }

    public static final LiveData copydefault(ScamAnnouncementBannerViewModel scamAnnouncementBannerViewModel, String str) {
        if (str == null) {
            return new MutableLiveData(null);
        }
        return FlowLiveDataConversions.asLiveData$default(scamAnnouncementBannerViewModel.AEQbTJ.AEQbTJ(str, scamAnnouncementBannerViewModel.copydefault), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public final void EZpvd(String str, IMPageType iMPageType) {
        this.copydefault = iMPageType;
        this.EZpvd.setValue(str);
    }

    public final void OLrzqt() {
        Object objM7377constructorimpl;
        String value = this.EZpvd.getValue();
        if (value != null) {
            try {
                Result.Application application = Result.Companion;
                this.KWHzl.AEQbTJ(value);
                MutableLiveData<String> mutableLiveData = this.EZpvd;
                mutableLiveData.setValue(mutableLiveData.getValue());
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7376boximpl(objM7377constructorimpl);
        }
    }
}
