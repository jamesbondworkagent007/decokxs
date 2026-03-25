package o;

import androidx.compose.material3.CalendarModelKt;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.bean.BannerModelBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.impl.BannerModelManager$getBannerModelByContentId$1;
import com.okinc.ok_kyc_core.impl.BannerModelManager$getBannerModelByContentId$apiResult$1$1;
import com.okinc.rxutils.RxBus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43419rot;
import o.InterfaceC43702ruK;
import o.rCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rCM {
    public static final rCM copydefault;

    private rCM() {
    }

    static {
        final rCM rcm = new rCM();
        copydefault = rcm;
        RxBus.AEQbTJ("EVENT_CHANGE_LANGUAGE").subscribe(new RxBus.EventCallback<java.lang.String>(rcm) { // from class: com.okinc.ok_kyc_core.impl.BannerModelManager$1
            {
                super(rcm);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                SPUtils.put("sp_banner_time", (Object) 0L, "sp_compliance_banner_file_name");
                rCM.copydefault.copydefault();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:12:0x003c, B:39:0x00b9, B:41:0x00c1, B:43:0x00c7, B:44:0x00d4), top: B:76:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d A[Catch: Exception -> 0x01b1, TryCatch #3 {Exception -> 0x01b1, blocks: (B:51:0x0129, B:53:0x012d, B:55:0x013b, B:56:0x0142, B:58:0x0148, B:61:0x0158, B:63:0x016f, B:65:0x0184, B:67:0x0188, B:69:0x01ab, B:70:0x01b0), top: B:81:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184 A[Catch: Exception -> 0x01b1, TryCatch #3 {Exception -> 0x01b1, blocks: (B:51:0x0129, B:53:0x012d, B:55:0x013b, B:56:0x0142, B:58:0x0148, B:61:0x0158, B:63:0x016f, B:65:0x0184, B:67:0x0188, B:69:0x01ab, B:70:0x01b0), top: B:81:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(long j, @NotNull Continuation<? super BannerModelBean> continuation) throws java.lang.Throwable {
        BannerModelManager$getBannerModelByContentId$1 bannerModelManager$getBannerModelByContentId$1;
        BannerModelBean bannerModelBean;
        rCM rcm;
        BannerModelBean bannerModelBean2;
        java.lang.Object next;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        long j2 = j;
        if (continuation instanceof BannerModelManager$getBannerModelByContentId$1) {
            bannerModelManager$getBannerModelByContentId$1 = (BannerModelManager$getBannerModelByContentId$1) continuation;
            int i = bannerModelManager$getBannerModelByContentId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bannerModelManager$getBannerModelByContentId$1.label = i - Integer.MIN_VALUE;
            } else {
                bannerModelManager$getBannerModelByContentId$1 = new BannerModelManager$getBannerModelByContentId$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = bannerModelManager$getBannerModelByContentId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bannerModelManager$getBannerModelByContentId$1.label;
        java.lang.Object obj = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            java.lang.Long l = SPUtils.getLong("sp_banner_time", 0L, "sp_compliance_banner_file_name");
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            Intrinsics.copydefault(l);
            long jLongValue = l.longValue();
            java.util.ArrayList arrayList = SPUtils.getArrayList("sp_banner_model", BannerModelBean.class, "sp_compliance_banner_file_name");
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((BannerModelBean) next).getContentId() == j2) {
                        break;
                    }
                }
                bannerModelBean = (BannerModelBean) next;
            } else {
                bannerModelBean = null;
            }
            if (jCurrentTimeMillis - jLongValue > CalendarModelKt.MillisecondsIn24Hours || bannerModelBean == null) {
                try {
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    BannerModelManager$getBannerModelByContentId$apiResult$1$1 bannerModelManager$getBannerModelByContentId$apiResult$1$1 = new BannerModelManager$getBannerModelByContentId$apiResult$1$1(null);
                    bannerModelManager$getBannerModelByContentId$1.L$0 = this;
                    bannerModelManager$getBannerModelByContentId$1.L$1 = bannerModelBean;
                    bannerModelManager$getBannerModelByContentId$1.J$0 = j2;
                    bannerModelManager$getBannerModelByContentId$1.label = 1;
                    objWithContext = BuildersKt.withContext(io2, bannerModelManager$getBannerModelByContentId$apiResult$1$1, bannerModelManager$getBannerModelByContentId$1);
                } catch (java.lang.Throwable th) {
                    th = th;
                    rcm = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    BannerModelBean bannerModelBean3 = bannerModelBean;
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    bannerModelBean2 = bannerModelBean3;
                }
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                rcm = this;
                bannerModelBean2 = bannerModelBean;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                    }
                }
            } else {
                pUU.KWHzl("BannerModelManager", "use cache");
                return bannerModelBean;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = bannerModelManager$getBannerModelByContentId$1.J$0;
            bannerModelBean2 = (BannerModelBean) bannerModelManager$getBannerModelByContentId$1.L$1;
            rcm = (rCM) bannerModelManager$getBannerModelByContentId$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
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
                bannerModelBean = bannerModelBean2;
                try {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    BannerModelBean bannerModelBean32 = bannerModelBean;
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    bannerModelBean2 = bannerModelBean32;
                } catch (java.lang.Exception e) {
                    e = e;
                }
            }
            try {
                if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                    java.util.ArrayList<BannerModelBean> arrayList2 = (java.util.ArrayList) ((AbstractC43419rot.StateListAnimator) actionBar).AEQbTJ();
                    if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
                        rcm.AEQbTJ(arrayList2);
                        java.util.Iterator<T> it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            java.lang.Object next2 = it2.next();
                            if (j2 == ((BannerModelBean) next2).getContentId()) {
                                obj = next2;
                                break;
                            }
                        }
                        BannerModelBean bannerModelBean4 = (BannerModelBean) obj;
                        pUU.KWHzl("BannerModelManager", "update success, target=" + bannerModelBean4);
                        return bannerModelBean4;
                    }
                    pUU.KWHzl("BannerModelManager", "bannerList is empty, cache=" + bannerModelBean2);
                    return bannerModelBean2;
                }
                if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                pUU.KWHzl("BannerModelManager", "business error=" + ((AbstractC43419rot.ActionBar) actionBar).KWHzl() + " " + bannerModelBean2);
                return bannerModelBean2;
            } catch (java.lang.Exception e2) {
                e = e2;
                bannerModelBean = bannerModelBean2;
            }
        }
        pUU.KWHzl("BannerModelManager", "e=" + e);
        return bannerModelBean;
    }

    public final void copydefault() {
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null).KWHzl());
        final Function1 function1 = new Function1() { // from class: o.rCK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCM.OLrzqt((ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rCI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCM.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rCN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCM.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rCR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCM.KWHzl(function12, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ResponseData responseData) {
        java.util.ArrayList<BannerModelBean> arrayList = (java.util.ArrayList) responseData.getData();
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            rCM rcm = copydefault;
            Intrinsics.copydefault(arrayList);
            rcm.AEQbTJ(arrayList);
            pUU.KWHzl("BannerModelManager", "refreshData after language change");
        } else {
            pUU.KWHzl("BannerModelManager", "refreshData invalid code=" + responseData.getCode() + " size=" + (arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null));
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        pUU.KWHzl("BannerModelManager", "refreshData throwable=" + th);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.util.ArrayList<BannerModelBean> arrayList) {
        SPUtils.put("sp_banner_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "sp_compliance_banner_file_name");
        SPUtils.put("sp_banner_model", arrayList, "sp_compliance_banner_file_name");
    }
}
