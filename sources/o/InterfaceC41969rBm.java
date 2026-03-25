package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlifaceResultResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlifaceTokenResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddresses;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ChinaAddressBean;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FieldDisplay;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormatCompleteAddresses;
import com.okinc.ok_kyc_core.data.remote.networkmodel.GroupList;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MergeAccountResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorTokenResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorVerifyResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OkxGroupedValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OkxValues;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OssImageUrlResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SingleFileUploadResultReq;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SingleFileUploadResultResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName;
import com.okinc.ok_kyc_core.data.remote.networkmodel.WCResultResp;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC41969rBm {
    java.lang.Object AEQbTJ(@NotNull SingleFileUploadResultReq singleFileUploadResultReq, @NotNull Continuation<? super AbstractC43728ruk<SingleFileUploadResultResp, ResponseFailedException>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.List<FormatCompleteAddresses>, ResponseFailedException>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43728ruk<AlifaceResultResp, ResponseFailedException>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.util.List<SingleFileUploadUseCase.UploadedFile> list, int i, int i2, @NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super AbstractC43728ruk<MultiVendorVerifyResponse, ResponseFailedException>> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43728ruk<MultiVendorTokenResp, ResponseFailedException>> continuation);

    java.lang.Object AhwBna(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.List<Value>, ResponseFailedException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<OkxValues, ResponseFailedException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull C41957rBa c41957rBa, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.ArrayList<FieldDisplay>, ResponseFailedException>> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation);

    java.lang.Object KWHzl(@NotNull SingleFileUploadResultReq singleFileUploadResultReq, @NotNull Continuation<? super AbstractC43728ruk<SingleFileUploadResultResp, ResponseFailedException>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str4, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map2, @NotNull java.util.Map<java.lang.String, java.lang.String> map3, java.lang.String str5, java.lang.String str6, @NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.ArrayList<ChinaAddressBean>, ResponseFailedException>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<AutoCompleteAddresses, ResponseFailedException>> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43728ruk<AlifaceTokenResp, ResponseFailedException>> continuation);

    java.lang.Object OLrzqt(long j, @NotNull Continuation<? super AbstractC43728ruk<OssImageUrlResp, ResponseFailedException>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str4, @NotNull C41957rBa c41957rBa, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, @NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.HashMap<java.lang.String, ValueAndName>, ResponseFailedException>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<GroupList, ResponseFailedException>> continuation);

    java.lang.Object OLrzqt(java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<java.lang.String, ResponseFailedException>> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.ArrayList<FieldDisplay>, ResponseFailedException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull C41957rBa c41957rBa, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.ArrayList<FieldDisplay>, ResponseFailedException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43728ruk<AlifaceTokenResp, ResponseFailedException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<OkxGroupedValue, ResponseFailedException>> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<SingleFileUploadUseCase.UploadedFile> list, int i, int i2, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43728ruk<MultiVendorVerifyResponse, ResponseFailedException>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43728ruk<MergeAccountResponse, ResponseFailedException>> continuation);

    java.lang.Object djBIcL(@NotNull java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<WCResultResp, ResponseFailedException>> continuation);
}
