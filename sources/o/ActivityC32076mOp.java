package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mOp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC32076mOp extends AbstractActivityC33041mov {
    public AbstractC32036mNc OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC32036mNc abstractC32036mNc = (AbstractC32036mNc) DataBindingUtil.setContentView(this, C31976mKx.Application.AkhnZx);
        this.OLrzqt = abstractC32036mNc;
        AbstractC32036mNc abstractC32036mNc2 = null;
        if (abstractC32036mNc == null) {
            Intrinsics.gEmmrt("");
            abstractC32036mNc = null;
        }
        setSupportActionBar(abstractC32036mNc.OLrzqt);
        AbstractC32036mNc abstractC32036mNc3 = this.OLrzqt;
        if (abstractC32036mNc3 == null) {
            Intrinsics.gEmmrt("");
            abstractC32036mNc3 = null;
        }
        abstractC32036mNc3.getRoot().setPadding(0, C33570myu.AEQbTJ((android.content.Context) this), 0, 0);
        AbstractC32036mNc abstractC32036mNc4 = this.OLrzqt;
        if (abstractC32036mNc4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC32036mNc2 = abstractC32036mNc4;
        }
        abstractC32036mNc2.OLrzqt.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.mOo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC32076mOp.KWHzl(this.copydefault, view);
            }
        });
        OLrzqt(getIntent());
    }

    public static final void KWHzl(ActivityC32076mOp activityC32076mOp, android.view.View view) {
        activityC32076mOp.finish();
    }

    public final void OLrzqt(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("EXT_JSON_VALUE");
        AbstractC32036mNc abstractC32036mNc = this.OLrzqt;
        AbstractC32036mNc abstractC32036mNc2 = null;
        if (abstractC32036mNc == null) {
            Intrinsics.gEmmrt("");
            abstractC32036mNc = null;
        }
        abstractC32036mNc.KWHzl.removeAllViews();
        C5474Td c5474Td = new C5474Td(this);
        AbstractC32036mNc abstractC32036mNc3 = this.OLrzqt;
        if (abstractC32036mNc3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC32036mNc2 = abstractC32036mNc3;
        }
        abstractC32036mNc2.KWHzl.addView(c5474Td, new ViewGroup.LayoutParams(-1, -1));
        c5474Td.copydefault(stringExtra);
        c5474Td.copydefault();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        OLrzqt(intent);
    }

    /* JADX INFO: renamed from: o.mOp$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mOp.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC32076mOp.class);
            intent.setFlags(536870912);
            intent.putExtra("EXT_JSON_VALUE", str);
            return intent;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
