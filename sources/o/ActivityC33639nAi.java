package o;

import androidx.core.os.BundleKt;
import com.okinc.im.bean.IMUserInfo;
import com.okinc.im.imui.contacts.qrcode.MyQRCodeDisplayActivity$loadSelfQRCodeInfo$1$1;
import com.okinc.im.imui.qrcode.QRCodeInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nAi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class ActivityC33639nAi extends AbstractActivityC37267oqc {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public com.okinc.okimcore.model.remote.UserInfo EZpvd;
    public final int OLrzqt = C35399nuc.Dialog.isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC37267oqc, o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.nAi$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nAi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, com.okinc.okimcore.model.remote.UserInfo userInfo) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC33639nAi.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("info", userInfo)));
            return intent;
        }
    }

    @Override // o.AbstractActivityC37267oqc, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.okinc.okimcore.model.remote.UserInfo userInfo = (com.okinc.okimcore.model.remote.UserInfo) getIntent().getParcelableExtra("info");
        this.EZpvd = userInfo;
        Intrinsics.copydefault(userInfo);
        EZpvd(buildQRCodeInfo$default(this, userInfo, null, 2, null));
        AEQbTJ(new Function1() { // from class: o.nAr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC33639nAi.EZpvd(this.EZpvd, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(ActivityC33639nAi activityC33639nAi, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        com.okinc.okimcore.model.remote.UserInfo userInfo = activityC33639nAi.EZpvd;
        Intrinsics.copydefault(userInfo);
        activityC33639nAi.EZpvd(activityC33639nAi.OLrzqt(userInfo, str));
        rVN.reportFullyDrawn$default((android.app.Activity) activityC33639nAi, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC37267oqc
    public void copydefault(@NotNull C35893oHp c35893oHp, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        com.okinc.okimcore.model.remote.UserInfo userInfo = this.EZpvd;
        Intrinsics.copydefault(userInfo);
        java.lang.String strKWHzl = C44157sFk.KWHzl();
        java.lang.String str2 = strKWHzl == null ? "" : strKWHzl;
        java.lang.String avatar = userInfo.getAvatar();
        C35891oHn.EZpvd((android.widget.ImageView) c35893oHp, new IMUserInfo(str2, avatar == null ? "" : avatar, C44170sFx.OLrzqt(userInfo), (OfficialTagInfo) null, 8, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ QRCodeInfo buildQRCodeInfo$default(ActivityC33639nAi activityC33639nAi, com.okinc.okimcore.model.remote.UserInfo userInfo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return activityC33639nAi.OLrzqt(userInfo, str);
    }

    public final QRCodeInfo OLrzqt(com.okinc.okimcore.model.remote.UserInfo userInfo, java.lang.String str) {
        java.lang.String avatar = userInfo.getAvatar();
        if (avatar == null) {
            avatar = "";
        }
        return new QRCodeInfo(avatar, C44170sFx.OLrzqt(userInfo), str, getString(C35399nuc.LoaderManager.DBxZfM), userInfo.getOfficialTag());
    }

    public final void AEQbTJ(final Function1<? super java.lang.String, Unit> function1) {
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null) {
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(C33024moe.KWHzl(C44525sTa.copydefault.EZpvd(new MyQRCodeDisplayActivity$loadSelfQRCodeInfo$1$1(interfaceC35180nqU, null))), this);
            final Function1 function12 = new Function1() { // from class: o.nAo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC33639nAi.KWHzl(function1, (java.lang.String) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.nAn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC33639nAi.EZpvd(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.nAq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC33639nAi.copydefault((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.nAp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC33639nAi.copydefault(function13, obj);
                }
            });
        }
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function1 function1, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        C33134mqi.AEQbTJ(C44157sFk.copydefault(th));
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // o.AbstractActivityC37267oqc, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37267oqc, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC37267oqc, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC37267oqc, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
