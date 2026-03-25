package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryResponse;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationEntryPointEnum;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.domain.notificationcenter.GetNotificationCategoryListUseCase$invoke$1;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rYV {
    public final C42601rYx EZpvd;
    public final OKComplianceRestrictionService KWHzl;

    @yCM
    public rYV(@NotNull C42601rYx c42601rYx, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService) {
        Intrinsics.checkNotNullParameter(c42601rYx, "");
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        this.EZpvd = c42601rYx;
        this.KWHzl = oKComplianceRestrictionService;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:23:0x004c, B:25:0x0054, B:27:0x005a, B:28:0x0067), top: B:69:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull NotificationEntryPointEnum notificationEntryPointEnum, @NotNull Continuation<? super java.util.List<NotificationCategoryBean>> continuation) throws java.lang.Throwable {
        GetNotificationCategoryListUseCase$invoke$1 getNotificationCategoryListUseCase$invoke$1;
        java.lang.Throwable th;
        rYV ryv;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof GetNotificationCategoryListUseCase$invoke$1) {
            getNotificationCategoryListUseCase$invoke$1 = (GetNotificationCategoryListUseCase$invoke$1) continuation;
            int i = getNotificationCategoryListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getNotificationCategoryListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getNotificationCategoryListUseCase$invoke$1 = new GetNotificationCategoryListUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getNotificationCategoryListUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getNotificationCategoryListUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ryv = (rYV) getNotificationCategoryListUseCase$invoke$1.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
                responseData = (ResponseData) objKWHzl;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } else {
            C56391yDq.AEQbTJ(objKWHzl);
            try {
                C42601rYx c42601rYx = this.EZpvd;
                getNotificationCategoryListUseCase$invoke$1.L$0 = this;
                getNotificationCategoryListUseCase$invoke$1.label = 1;
                objKWHzl = c42601rYx.KWHzl(notificationEntryPointEnum, getNotificationCategoryListUseCase$invoke$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                ryv = this;
                responseData = (ResponseData) objKWHzl;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                ryv = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            AbstractC43419rot.StateListAnimator stateListAnimator = (AbstractC43419rot.StateListAnimator) actionBar;
            pUU.KWHzl("FetchNotificationCategoriesUseCase", "getSystemNotificationCategoryList: success: " + ((NotificationCategoryResponse) stateListAnimator.KWHzl()).getCategories());
            java.util.List<NotificationCategoryBean> categories = ((NotificationCategoryResponse) stateListAnimator.KWHzl()).getCategories();
            if (categories == null) {
                categories = yDY.AhwBna();
            }
            InterfaceC56445yFq<OKComplianceRestrictionService.Feature> entries = OKComplianceRestrictionService.Feature.getEntries();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(entries, 10)), 16));
            for (OKComplianceRestrictionService.Feature feature : entries) {
                linkedHashMap.put(feature.getType(), feature);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : categories) {
                NotificationCategoryBean notificationCategoryBean = (NotificationCategoryBean) obj;
                java.util.List<java.lang.String> featureRestrictionList = notificationCategoryBean.getFeatureRestrictionList();
                if (featureRestrictionList != null && !featureRestrictionList.isEmpty()) {
                    java.util.List<java.lang.String> featureRestrictionList2 = notificationCategoryBean.getFeatureRestrictionList();
                    Intrinsics.copydefault(featureRestrictionList2);
                    if (!(featureRestrictionList2 instanceof java.util.Collection) || !featureRestrictionList2.isEmpty()) {
                        java.util.Iterator<T> it = featureRestrictionList2.iterator();
                        while (it.hasNext()) {
                            if (((OKComplianceRestrictionService.Feature) linkedHashMap.get((java.lang.String) it.next())) == null || !(!ryv.KWHzl.AEQbTJ(r4))) {
                            }
                        }
                    }
                }
                arrayList.add(obj);
            }
            return arrayList;
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        pUU.copydefault("FetchNotificationCategoriesUseCase", "getSystemNotificationCategoryList: error: " + ((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()).getMessage());
        return yDY.AhwBna();
    }
}
