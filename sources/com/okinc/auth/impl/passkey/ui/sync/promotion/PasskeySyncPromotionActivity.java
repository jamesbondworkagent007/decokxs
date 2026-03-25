package com.okinc.auth.impl.passkey.ui.sync.promotion;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import com.okinc.auth.impl.passkey.ui.sync.promotion.PasskeySyncPromotionActivity;
import com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC6493aQQ;
import o.AbstractC8271azb;
import o.C33054mpH;
import o.C43454rpb;
import o.C52794wYp;
import o.C55296xhK;
import o.C58893zTh;
import o.yCM;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import uniffi.account.PromotionButtonName;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeySyncPromotionActivity extends AbstractActivityC6493aQQ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public AbstractC8271azb djBIcL;

    @yCM
    public C58893zTh passkeyTracker;
    public String valueOf = "PasskeySyncPromotionActivity";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public String getTAG() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Possible override for method o.aQQ.EZpvd()V */
    public final C58893zTh EZpvd() {
        C58893zTh c58893zTh = this.passkeyTracker;
        if (c58893zTh != null) {
            return c58893zTh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.sync.promotion.PasskeySyncPromotionActivity.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AbstractActivityC6493aQQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        AbstractC8271azb abstractC8271azbEZpvd = AbstractC8271azb.EZpvd(getLayoutInflater());
        this.djBIcL = abstractC8271azbEZpvd;
        setContentView(abstractC8271azbEZpvd != null ? abstractC8271azbEZpvd.getRoot() : null);
        AhwBna();
    }

    private final void AhwBna() {
        AbstractC8271azb abstractC8271azb = this.djBIcL;
        if (abstractC8271azb != null) {
            EZpvd().OLrzqt();
            ImageView imageView = abstractC8271azb.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/auth/common/passkey/okx_passkey_promotion_sync.webp", this, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
            C52794wYp c52794wYp = abstractC8271azb.copydefault;
            c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
            C52794wYp c52794wYp2 = abstractC8271azb.OLrzqt;
            c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, this));
            abstractC8271azb.AEQbTJ.setNavigationIconVisible(false);
            abstractC8271azb.AEQbTJ.setRightIconOnClickListener(new Function0() { // from class: o.aQW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return PasskeySyncPromotionActivity.KWHzl(this.OLrzqt);
                }
            });
        }
    }

    public static final Unit KWHzl(PasskeySyncPromotionActivity passkeySyncPromotionActivity) {
        passkeySyncPromotionActivity.finish();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // o.AbstractActivityC6493aQQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.djBIcL = null;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ PasskeySyncPromotionActivity OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, PasskeySyncPromotionActivity passkeySyncPromotionActivity) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = passkeySyncPromotionActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.EZpvd().copydefault(PromotionButtonName.SYNC);
                PasskeySyncPromotionActivity passkeySyncPromotionActivity = this.OLrzqt;
                passkeySyncPromotionActivity.startActivity(PasskeySyncStepperActivity.Companion.AEQbTJ(passkeySyncPromotionActivity));
                this.OLrzqt.finish();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ PasskeySyncPromotionActivity EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, PasskeySyncPromotionActivity passkeySyncPromotionActivity) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = passkeySyncPromotionActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.EZpvd().copydefault(PromotionButtonName.LATER);
                this.EZpvd.finish();
            }
        }
    }

    @Override // o.AbstractActivityC6493aQQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6493aQQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6493aQQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6493aQQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
