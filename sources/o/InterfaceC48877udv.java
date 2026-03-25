package o;

import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.resource.request.CombinedResourceRequestBody;
import com.okinc.resource.request.CombinedResourceResponse;
import com.okinc.resource.request.DynamicResourceUpdateRequestBody;
import com.okinc.resource.request.DynamicResourceUpdateResp;
import com.okinc.resource.request.MiniAppUpdateRequestBody;
import com.okinc.resource.request.MiniAppUpdateResp;
import com.okinc.resource.request.MlnUpdateRequest;
import com.okinc.resource.request.MlnUpdateResp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC48877udv;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.udv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC48877udv {
    public static final Activity Companion = Activity.copydefault;

    @POST("/app/upgrade/resources")
    AbstractC58185ywX<ResponseData<CombinedResourceResponse>> copydefault(@Body @NotNull CombinedResourceRequestBody combinedResourceRequestBody, @Header("Subdomain-Strategy") SubdomainStrategy subdomainStrategy);

    /* JADX INFO: renamed from: o.udv$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ AbstractC58185ywX combinedResourceUpdate$default(InterfaceC48877udv interfaceC48877udv, CombinedResourceRequestBody combinedResourceRequestBody, SubdomainStrategy subdomainStrategy, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: combinedResourceUpdate");
            }
            if ((i & 2) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return interfaceC48877udv.copydefault(combinedResourceRequestBody, subdomainStrategy);
        }
    }

    /* JADX INFO: renamed from: o.udv$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity copydefault = new Activity();

        private Activity() {
        }

        public final AbstractC58185ywX<ResponseData<MlnUpdateResp>> EZpvd(MlnUpdateRequest mlnUpdateRequest) {
            AbstractC58185ywX abstractC58185ywXCombinedResourceUpdate$default = TaskDescription.combinedResourceUpdate$default((InterfaceC48877udv) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC48877udv.class), null, 1, null), new CombinedResourceRequestBody(mlnUpdateRequest, (DynamicResourceUpdateRequestBody) null, (MiniAppUpdateRequestBody) null, (MlnUpdateRequest) null, 14, (DefaultConstructorMarker) null), null, 2, null);
            final Function1 function1 = new Function1() { // from class: o.udu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC48877udv.Activity.copydefault((ResponseData) obj);
                }
            };
            AbstractC58185ywX<ResponseData<MlnUpdateResp>> abstractC58185ywXAEQbTJ = abstractC58185ywXCombinedResourceUpdate$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.udw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC48877udv.Activity.AEQbTJ(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }

        public static final ResponseData AEQbTJ(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResponseData) function1.invoke(obj);
        }

        public static final ResponseData copydefault(ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            int code = responseData.getCode();
            java.lang.String msg = responseData.getMsg();
            CombinedResourceResponse combinedResourceResponse = (CombinedResourceResponse) responseData.getData();
            return new ResponseData(code, msg, null, null, combinedResourceResponse != null ? combinedResourceResponse.getOklua() : null, null, 44, null);
        }

        public final AbstractC58185ywX<ResponseData<java.util.List<MiniAppUpdateResp>>> KWHzl(MiniAppUpdateRequestBody miniAppUpdateRequestBody) {
            AbstractC58185ywX abstractC58185ywXCombinedResourceUpdate$default = TaskDescription.combinedResourceUpdate$default((InterfaceC48877udv) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC48877udv.class), null, 1, null), new CombinedResourceRequestBody((MlnUpdateRequest) null, (DynamicResourceUpdateRequestBody) null, miniAppUpdateRequestBody, (MlnUpdateRequest) null, 11, (DefaultConstructorMarker) null), null, 2, null);
            final Function1 function1 = new Function1() { // from class: o.udx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC48877udv.Activity.KWHzl((ResponseData) obj);
                }
            };
            AbstractC58185ywX<ResponseData<java.util.List<MiniAppUpdateResp>>> abstractC58185ywXAEQbTJ = abstractC58185ywXCombinedResourceUpdate$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.udz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC48877udv.Activity.OLrzqt(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }

        public static final ResponseData OLrzqt(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResponseData) function1.invoke(obj);
        }

        public static final ResponseData KWHzl(ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            int code = responseData.getCode();
            java.lang.String msg = responseData.getMsg();
            CombinedResourceResponse combinedResourceResponse = (CombinedResourceResponse) responseData.getData();
            return new ResponseData(code, msg, null, null, combinedResourceResponse != null ? combinedResourceResponse.getMiniapp() : null, null, 44, null);
        }

        public final AbstractC58185ywX<ResponseData<java.util.List<DynamicResourceUpdateResp>>> OLrzqt(DynamicResourceUpdateRequestBody dynamicResourceUpdateRequestBody) {
            AbstractC58185ywX abstractC58185ywXCombinedResourceUpdate$default = TaskDescription.combinedResourceUpdate$default((InterfaceC48877udv) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC48877udv.class), null, 1, null), new CombinedResourceRequestBody((MlnUpdateRequest) null, dynamicResourceUpdateRequestBody, (MiniAppUpdateRequestBody) null, (MlnUpdateRequest) null, 13, (DefaultConstructorMarker) null), null, 2, null);
            final Function1 function1 = new Function1() { // from class: o.udy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC48877udv.Activity.djBIcL((ResponseData) obj);
                }
            };
            AbstractC58185ywX<ResponseData<java.util.List<DynamicResourceUpdateResp>>> abstractC58185ywXAEQbTJ = abstractC58185ywXCombinedResourceUpdate$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.udA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC48877udv.Activity.AhwBna(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }

        public static final ResponseData AhwBna(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResponseData) function1.invoke(obj);
        }

        public static final ResponseData djBIcL(ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            int code = responseData.getCode();
            java.lang.String msg = responseData.getMsg();
            CombinedResourceResponse combinedResourceResponse = (CombinedResourceResponse) responseData.getData();
            return new ResponseData(code, msg, null, null, combinedResourceResponse != null ? combinedResourceResponse.getFile() : null, null, 44, null);
        }

        public static /* synthetic */ AbstractC58185ywX from$default(Activity activity, MlnUpdateRequest mlnUpdateRequest, DynamicResourceUpdateRequestBody dynamicResourceUpdateRequestBody, MiniAppUpdateRequestBody miniAppUpdateRequestBody, MlnUpdateRequest mlnUpdateRequest2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mlnUpdateRequest = null;
            }
            if ((i & 2) != 0) {
                dynamicResourceUpdateRequestBody = null;
            }
            if ((i & 4) != 0) {
                miniAppUpdateRequestBody = null;
            }
            if ((i & 8) != 0) {
                mlnUpdateRequest2 = null;
            }
            return activity.OLrzqt(mlnUpdateRequest, dynamicResourceUpdateRequestBody, miniAppUpdateRequestBody, mlnUpdateRequest2);
        }

        public final AbstractC58185ywX<ResponseData<CombinedResourceResponse>> OLrzqt(MlnUpdateRequest mlnUpdateRequest, DynamicResourceUpdateRequestBody dynamicResourceUpdateRequestBody, MiniAppUpdateRequestBody miniAppUpdateRequestBody, MlnUpdateRequest mlnUpdateRequest2) {
            return TaskDescription.combinedResourceUpdate$default((InterfaceC48877udv) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC48877udv.class), null, 1, null), new CombinedResourceRequestBody(mlnUpdateRequest, dynamicResourceUpdateRequestBody, miniAppUpdateRequestBody, mlnUpdateRequest2), null, 2, null);
        }
    }
}
