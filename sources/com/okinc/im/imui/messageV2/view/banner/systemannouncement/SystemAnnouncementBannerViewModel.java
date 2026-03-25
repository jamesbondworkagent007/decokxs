package com.okinc.im.imui.messageV2.view.banner.systemannouncement;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.other.AnnouncementBanner;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32989mnw;
import o.C35745oCc;
import o.C35746oCd;
import o.C35763oCu;
import o.C56391yDq;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SystemAnnouncementBannerViewModel extends ViewModel {
    public final C35746oCd AEQbTJ;
    public final C35763oCu AYXKKw;
    public final C35745oCc EZpvd;
    public final MutableLiveData<C32989mnw<ActionBar>> KWHzl;
    public final MutableLiveData<AnnouncementBanner> OLrzqt;
    public final LiveData<C32989mnw<ActionBar>> copydefault;
    public final LiveData<AnnouncementBanner> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<AnnouncementBanner> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<ActionBar>> OLrzqt() {
        return this.copydefault;
    }

    @yCM
    public SystemAnnouncementBannerViewModel(@NotNull C35745oCc c35745oCc, @NotNull C35763oCu c35763oCu, @NotNull C35746oCd c35746oCd) {
        Intrinsics.checkNotNullParameter(c35745oCc, "");
        Intrinsics.checkNotNullParameter(c35763oCu, "");
        Intrinsics.checkNotNullParameter(c35746oCd, "");
        this.EZpvd = c35745oCc;
        this.AYXKKw = c35763oCu;
        this.AEQbTJ = c35746oCd;
        MutableLiveData<AnnouncementBanner> mutableLiveData = new MutableLiveData<>(null);
        this.OLrzqt = mutableLiveData;
        this.gEmmrt = mutableLiveData;
        MutableLiveData<C32989mnw<ActionBar>> mutableLiveData2 = new MutableLiveData<>();
        this.KWHzl = mutableLiveData2;
        this.copydefault = mutableLiveData2;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class ActionBar {
        public final String EZpvd;
        public final String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.EZpvd;
            }
            return actionBar.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
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
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) actionBar.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OpenAnnouncementDetailModel(detailTitle=" + this.OLrzqt + ", detailContentApp=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.EZpvd = str2;
        }
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SystemAnnouncementBannerViewModel$init$1(this, null), 3, null);
    }

    public final void EZpvd() {
        C35746oCd c35746oCd = this.AEQbTJ;
        AnnouncementBanner value = this.OLrzqt.getValue();
        if (value != null && c35746oCd.OLrzqt(value)) {
            this.OLrzqt.setValue(null);
        }
    }

    public final void copydefault() {
        Object objM7377constructorimpl;
        AnnouncementBanner value = this.OLrzqt.getValue();
        if (value != null) {
            try {
                Result.Application application = Result.Companion;
                this.AYXKKw.AEQbTJ(value);
                this.OLrzqt.setValue(null);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7376boximpl(objM7377constructorimpl);
        }
    }

    public final void gEmmrt() {
        AnnouncementBanner value = this.OLrzqt.getValue();
        if (value == null) {
            return;
        }
        String detailContentApp = value.getDetailContentApp();
        String detailTitle = value.getDetailTitle();
        if (detailContentApp == null || StringsKt__StringsKt.fARcdN((CharSequence) detailContentApp) || detailTitle == null || StringsKt__StringsKt.fARcdN((CharSequence) detailTitle)) {
            return;
        }
        this.KWHzl.setValue(new C32989mnw<>(new ActionBar(detailTitle, detailContentApp)));
    }
}
