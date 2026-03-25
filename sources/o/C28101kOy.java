package o;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.okinc.market.common.bean.PreMarketLandingBean;
import com.okinc.market.common.bean.PreMarketLandingDetail;
import com.okinc.market.common.service.BizMarketService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kOy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28101kOy extends AndroidViewModel {
    public MutableLiveData<java.util.ArrayList<PreMarketLandingBean>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.ArrayList<PreMarketLandingBean>> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28101kOy(@NotNull android.app.Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.OLrzqt = new MutableLiveData<>();
    }

    public final void AEQbTJ() {
        C33024moe.subscribeOnIO$default(((BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class))).loadPreMarketLandingList(), new Function1() { // from class: o.kOu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28101kOy.EZpvd(this.KWHzl, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.kOx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28101kOy.KWHzl(this.copydefault, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(C28101kOy c28101kOy, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c28101kOy.OLrzqt.postValue(null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C28101kOy c28101kOy, ResponseData responseData) {
        java.util.ArrayList<PreMarketLandingBean> arrayList;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            MutableLiveData<java.util.ArrayList<PreMarketLandingBean>> mutableLiveData = c28101kOy.OLrzqt;
            PreMarketLandingDetail preMarketLandingDetail = (PreMarketLandingDetail) responseData.getData();
            if (preMarketLandingDetail == null || (arrayList = preMarketLandingDetail.getData()) == null) {
                arrayList = new java.util.ArrayList<>();
            }
            mutableLiveData.postValue(arrayList);
        } else {
            c28101kOy.OLrzqt.postValue(null);
        }
        return Unit.INSTANCE;
    }
}
