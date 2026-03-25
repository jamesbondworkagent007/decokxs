package com.okinc.im.imui.messageV2.view.banner.bannerlist;

import androidx.lifecycle.ViewModel;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.remote.GroupBannerList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C35792oDw;
import o.C56391yDq;
import o.C56442yFn;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class BannerListViewModel extends ViewModel {
    public final MutableStateFlow<GroupBannerList> AEQbTJ;
    public final C35792oDw KWHzl;
    public final MutableStateFlow<GroupBannerList> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<GroupBannerList> OLrzqt() {
        return this.copydefault;
    }

    @yCM
    public BannerListViewModel(@NotNull C35792oDw c35792oDw) {
        Intrinsics.checkNotNullParameter(c35792oDw, "");
        this.KWHzl = c35792oDw;
        MutableStateFlow<GroupBannerList> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.copydefault = MutableStateFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        BannerListViewModel$loadBanners$1 bannerListViewModel$loadBanners$1;
        BannerListViewModel bannerListViewModel;
        if (continuation instanceof BannerListViewModel$loadBanners$1) {
            bannerListViewModel$loadBanners$1 = (BannerListViewModel$loadBanners$1) continuation;
            int i = bannerListViewModel$loadBanners$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bannerListViewModel$loadBanners$1.label = i - Integer.MIN_VALUE;
            } else {
                bannerListViewModel$loadBanners$1 = new BannerListViewModel$loadBanners$1(this, continuation);
            }
        }
        Object objOLrzqt = bannerListViewModel$loadBanners$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = bannerListViewModel$loadBanners$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C35792oDw c35792oDw = this.KWHzl;
            bannerListViewModel$loadBanners$1.L$0 = this;
            bannerListViewModel$loadBanners$1.label = 1;
            objOLrzqt = c35792oDw.OLrzqt(str, bannerListViewModel$loadBanners$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            bannerListViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bannerListViewModel = (BannerListViewModel) bannerListViewModel$loadBanners$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        ResponseData responseData = (ResponseData) objOLrzqt;
        if (responseData.getCode() == 0) {
            bannerListViewModel.AEQbTJ.setValue((GroupBannerList) responseData.getData());
        } else {
            bannerListViewModel.AEQbTJ.setValue(null);
        }
        return Unit.INSTANCE;
    }
}
