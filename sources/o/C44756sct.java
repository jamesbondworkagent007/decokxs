package o;

import androidx.activity.result.contract.ActivityResultContract;
import com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoRequest;
import com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoResponse;
import com.okinc.okcomponents.feature.okwalletdefi.standalone.mock.external.impl.account.OKXWeb3DependencyException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44756sct extends AbstractC43215rlA implements InterfaceC8168axe {
    public final java.lang.String OLrzqt = C44756sct.class.getSimpleName();

    @Override // o.InterfaceC8168axe
    public ActivityResultContract<UploadPersonalInfoRequest, UploadPersonalInfoResponse> OLrzqt() {
        java.lang.String str = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.sct$StateListAnimator */
    public static final class StateListAnimator extends ActivityResultContract<UploadPersonalInfoRequest, UploadPersonalInfoResponse> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, UploadPersonalInfoRequest uploadPersonalInfoRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(uploadPersonalInfoRequest, "");
            return new android.content.Intent();
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public UploadPersonalInfoResponse parseResult(int i, android.content.Intent intent) {
            return new UploadPersonalInfoResponse(false, (java.lang.String) null, (java.util.List) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4095, (DefaultConstructorMarker) null);
        }
    }

    @Override // o.InterfaceC8168axe
    public ActivityResultContract<UploadPersonalInfoRequest, UploadPersonalInfoResponse> AEQbTJ() {
        java.lang.String str = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return new ActionBar();
    }

    /* JADX INFO: renamed from: o.sct$ActionBar */
    public static final class ActionBar extends ActivityResultContract<UploadPersonalInfoRequest, UploadPersonalInfoResponse> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, UploadPersonalInfoRequest uploadPersonalInfoRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(uploadPersonalInfoRequest, "");
            return new android.content.Intent();
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public UploadPersonalInfoResponse parseResult(int i, android.content.Intent intent) {
            return new UploadPersonalInfoResponse(false, (java.lang.String) null, (java.util.List) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4095, (DefaultConstructorMarker) null);
        }
    }
}
