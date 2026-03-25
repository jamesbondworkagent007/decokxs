package o;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C5714aBg;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ActivityC5653aAY extends AppCompatActivity {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public android.widget.TextView AEQbTJ;
    public android.widget.LinearLayout EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.aBd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC5653aAY.EZpvd(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.aBb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC5653aAY.KWHzl(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.aAY$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aAY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final android.content.SharedPreferences KWHzl() {
        return (android.content.SharedPreferences) this.KWHzl.getValue();
    }

    public static final android.content.SharedPreferences EZpvd(ActivityC5653aAY activityC5653aAY) {
        return C5714aBg.copydefault.AEQbTJ(activityC5653aAY, "com.okx.passkey.v2.storage.encrypted");
    }

    public final android.content.SharedPreferences EZpvd() {
        return (android.content.SharedPreferences) this.copydefault.getValue();
    }

    public static final android.content.SharedPreferences KWHzl(ActivityC5653aAY activityC5653aAY) {
        return C5714aBg.copydefault.AEQbTJ(activityC5653aAY, "com.okx.passkey.v2.metadata.encrypted");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8206ayP.Application.AhwBna);
        this.AEQbTJ = (android.widget.TextView) findViewById(C8206ayP.StateListAnimator.UscePu);
        this.EZpvd = (android.widget.LinearLayout) findViewById(C8206ayP.StateListAnimator.aJFbMH);
        ((android.widget.Button) findViewById(C8206ayP.StateListAnimator.dvImUD)).setOnClickListener(new View.OnClickListener() { // from class: o.aBc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC5653aAY.copydefault(this.KWHzl, view);
            }
        });
        ((android.widget.Button) findViewById(C8206ayP.StateListAnimator.aHXSQp)).setOnClickListener(new View.OnClickListener() { // from class: o.aBa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC5653aAY.OLrzqt(this.copydefault, view);
            }
        });
        AEQbTJ();
    }

    public static final void copydefault(ActivityC5653aAY activityC5653aAY, android.view.View view) {
        activityC5653aAY.AEQbTJ();
    }

    public static final void OLrzqt(final ActivityC5653aAY activityC5653aAY, android.view.View view) {
        new AlertDialog.Builder(activityC5653aAY).setTitle("⚠️ Delete ALL Passkeys").setMessage("This will permanently delete ALL passkeys from local storage.\n\nAre you sure?").setPositiveButton("Delete All", new DialogInterface.OnClickListener() { // from class: o.aBe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                ActivityC5653aAY.AEQbTJ(this.copydefault, dialogInterface, i);
            }
        }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).show();
    }

    public static final void AEQbTJ(ActivityC5653aAY activityC5653aAY, android.content.DialogInterface dialogInterface, int i) {
        activityC5653aAY.OLrzqt();
        activityC5653aAY.AEQbTJ();
    }

    public final void AEQbTJ() {
        java.lang.String strAkhnZx;
        java.lang.String string;
        java.lang.String strAkhnZx2;
        java.lang.String string2;
        android.widget.LinearLayout linearLayout = this.EZpvd;
        if (linearLayout == null) {
            Intrinsics.gEmmrt("");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("📋 ALL STORED PASSKEYS");
        sb.append('\n');
        sb.append("══════════════════════════════════════════════════");
        sb.append('\n');
        sb.append('\n');
        C5714aBg c5714aBg = C5714aBg.copydefault;
        C5714aBg.TaskDescription taskDescriptionCopydefault = c5714aBg.copydefault(this);
        sb.append("📈 SUMMARY");
        sb.append('\n');
        sb.append("─────────────────────────────────────────────────");
        sb.append('\n');
        sb.append("Label entries (uid:rpId):     " + taskDescriptionCopydefault.OLrzqt());
        sb.append('\n');
        sb.append("Account entries (credId):     " + taskDescriptionCopydefault.KWHzl());
        sb.append('\n');
        sb.append("Mapping entries:              " + taskDescriptionCopydefault.EZpvd());
        sb.append('\n');
        sb.append("Metadata entries:             " + taskDescriptionCopydefault.AEQbTJ());
        sb.append('\n');
        sb.append('\n');
        android.widget.TextView textView = this.AEQbTJ;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(sb.toString());
        java.lang.String string3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "");
        pUU.KWHzl("PasskeyKeyStoreDebug", string3);
        java.util.List<C5714aBg.Application> listKWHzl = c5714aBg.KWHzl(this);
        if (!listKWHzl.isEmpty()) {
            android.widget.LinearLayout linearLayout2 = this.EZpvd;
            if (linearLayout2 == null) {
                Intrinsics.gEmmrt("");
                linearLayout2 = null;
            }
            AEQbTJ(linearLayout2, "🔐 PASSKEYS (tap 🗑️ to delete)");
            for (C5714aBg.Application application : listKWHzl) {
                android.widget.LinearLayout linearLayout3 = this.EZpvd;
                if (linearLayout3 == null) {
                    Intrinsics.gEmmrt("");
                    linearLayout3 = null;
                }
                OLrzqt(linearLayout3, application);
            }
        } else {
            android.widget.LinearLayout linearLayout4 = this.EZpvd;
            if (linearLayout4 == null) {
                Intrinsics.gEmmrt("");
                linearLayout4 = null;
            }
            AEQbTJ(linearLayout4, "(No passkeys stored)");
        }
        android.widget.LinearLayout linearLayout5 = this.EZpvd;
        if (linearLayout5 == null) {
            Intrinsics.gEmmrt("");
            linearLayout5 = null;
        }
        AEQbTJ(linearLayout5, "🗂️ RAW STORAGE (Passkey)");
        if (KWHzl().getAll().isEmpty()) {
            android.widget.LinearLayout linearLayout6 = this.EZpvd;
            if (linearLayout6 == null) {
                Intrinsics.gEmmrt("");
                linearLayout6 = null;
            }
            EZpvd(linearLayout6, "(empty)", null, null);
        } else {
            java.util.Map<java.lang.String, ?> all = KWHzl().getAll();
            Intrinsics.checkNotNullExpressionValue(all, "");
            for (Map.Entry entry : C56423yEv.gEmmrt(all).entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null || (strAkhnZx = C59454zhO.AkhnZx(string, 40)) == null) {
                    strAkhnZx = "(null)";
                }
                android.widget.LinearLayout linearLayout7 = this.EZpvd;
                if (linearLayout7 == null) {
                    Intrinsics.gEmmrt("");
                    linearLayout7 = null;
                }
                Intrinsics.copydefault((java.lang.Object) str);
                EZpvd(linearLayout7, str, strAkhnZx + "...", "passkey");
            }
        }
        android.widget.LinearLayout linearLayout8 = this.EZpvd;
        if (linearLayout8 == null) {
            Intrinsics.gEmmrt("");
            linearLayout8 = null;
        }
        AEQbTJ(linearLayout8, "🗂️ RAW STORAGE (Metadata)");
        if (EZpvd().getAll().isEmpty()) {
            android.widget.LinearLayout linearLayout9 = this.EZpvd;
            if (linearLayout9 == null) {
                Intrinsics.gEmmrt("");
                linearLayout9 = null;
            }
            EZpvd(linearLayout9, "(empty)", null, null);
            return;
        }
        java.util.Map<java.lang.String, ?> all2 = EZpvd().getAll();
        Intrinsics.checkNotNullExpressionValue(all2, "");
        for (Map.Entry entry2 : C56423yEv.gEmmrt(all2).entrySet()) {
            java.lang.String str2 = (java.lang.String) entry2.getKey();
            java.lang.Object value2 = entry2.getValue();
            if (value2 == null || (string2 = value2.toString()) == null || (strAkhnZx2 = C59454zhO.AkhnZx(string2, 50)) == null) {
                strAkhnZx2 = "(null)";
            }
            android.widget.LinearLayout linearLayout10 = this.EZpvd;
            if (linearLayout10 == null) {
                Intrinsics.gEmmrt("");
                linearLayout10 = null;
            }
            Intrinsics.copydefault((java.lang.Object) str2);
            EZpvd(linearLayout10, str2, strAkhnZx2, TtmlNode.TAG_METADATA);
        }
    }

    public final void AEQbTJ(android.widget.LinearLayout linearLayout, java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(this);
        textView.setText(str);
        textView.setTypeface(null, 1);
        textView.setTextSize(14.0f);
        textView.setTextColor(-12303292);
        textView.setPadding(0, 24, 0, 8);
        linearLayout.addView(textView);
    }

    public final void OLrzqt(final android.widget.LinearLayout linearLayout, final C5714aBg.Application application) {
        final android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        linearLayout2.setPadding(16, 12, 16, 12);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 8, 0, 8);
        linearLayout2.setLayoutParams(layoutParams);
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        android.widget.TextView textView = new android.widget.TextView(this);
        textView.setText("🔑 " + C59454zhO.AkhnZx(application.AEQbTJ(), 24) + "...");
        textView.setTextSize(12.0f);
        textView.setTypeface(null, 1);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout3.addView(textView);
        android.widget.Button button = new android.widget.Button(this);
        button.setText("🗑️");
        button.setTextSize(14.0f);
        button.setMinWidth(48);
        button.setMinHeight(36);
        button.setMinimumWidth(48);
        button.setMinimumHeight(36);
        button.setPadding(8, 4, 8, 4);
        button.setOnClickListener(new View.OnClickListener() { // from class: o.aBi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC5653aAY.EZpvd(this.AEQbTJ, application, linearLayout, linearLayout2, view);
            }
        });
        linearLayout3.addView(button);
        linearLayout2.addView(linearLayout3);
        android.widget.TextView textView2 = new android.widget.TextView(this);
        java.lang.String strEZpvd = application.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = "(none)";
        }
        java.lang.String strCopydefault = application.copydefault();
        java.lang.String str = strCopydefault != null ? strCopydefault : "(none)";
        java.lang.String strKWHzl = application.KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "(unknown)";
        }
        textView2.setText("UID: " + strEZpvd + "\nRP ID: " + str + "\nCreated: " + strKWHzl);
        textView2.setTextSize(11.0f);
        textView2.setTextColor(-7829368);
        textView2.setTypeface(android.graphics.Typeface.MONOSPACE);
        textView2.setPadding(0, 8, 0, 0);
        linearLayout2.addView(textView2);
        android.widget.TextView textView3 = new android.widget.TextView(this);
        textView3.setText(application.OLrzqt() ? "✅ Bundle present" : "❌ Bundle missing");
        textView3.setTextSize(11.0f);
        textView3.setPadding(0, 4, 0, 0);
        linearLayout2.addView(textView3);
        linearLayout.addView(linearLayout2);
    }

    public static final void EZpvd(final ActivityC5653aAY activityC5653aAY, final C5714aBg.Application application, final android.widget.LinearLayout linearLayout, final android.widget.LinearLayout linearLayout2, android.view.View view) {
        new AlertDialog.Builder(activityC5653aAY).setTitle("Delete Passkey").setMessage("Delete passkey:\n" + C59454zhO.AkhnZx(application.AEQbTJ(), 32) + "...\n\nThis cannot be undone.").setPositiveButton("Delete", new DialogInterface.OnClickListener() { // from class: o.aBf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                ActivityC5653aAY.copydefault(this.copydefault, application, linearLayout, linearLayout2, dialogInterface, i);
            }
        }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).show();
    }

    public static final void copydefault(ActivityC5653aAY activityC5653aAY, C5714aBg.Application application, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, android.content.DialogInterface dialogInterface, int i) {
        C5714aBg.copydefault.EZpvd(activityC5653aAY, application.AEQbTJ());
        linearLayout.removeView(linearLayout2);
        activityC5653aAY.AEQbTJ();
    }

    public final void EZpvd(final android.widget.LinearLayout linearLayout, final java.lang.String str, java.lang.String str2, final java.lang.String str3) {
        java.lang.String str4;
        final android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(8, 4, 8, 4);
        android.widget.TextView textView = new android.widget.TextView(this);
        if (str2 != null) {
            str4 = str + "\n  → " + str2;
        } else {
            str4 = str;
        }
        textView.setText(str4);
        textView.setTextSize(10.0f);
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(textView);
        if (str3 != null && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "(empty)")) {
            android.widget.Button button = new android.widget.Button(this);
            button.setText("🗑️");
            button.setTextSize(12.0f);
            button.setMinWidth(40);
            button.setMinHeight(32);
            button.setMinimumWidth(40);
            button.setMinimumHeight(32);
            button.setPadding(4, 2, 4, 2);
            button.setOnClickListener(new View.OnClickListener() { // from class: o.aAW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC5653aAY.KWHzl(this.AEQbTJ, str, str3, linearLayout, linearLayout2, view);
                }
            });
            linearLayout2.addView(button);
        }
        linearLayout.addView(linearLayout2);
    }

    public static final void KWHzl(final ActivityC5653aAY activityC5653aAY, final java.lang.String str, final java.lang.String str2, final android.widget.LinearLayout linearLayout, final android.widget.LinearLayout linearLayout2, android.view.View view) {
        new AlertDialog.Builder(activityC5653aAY).setTitle("Delete Raw Entry").setMessage("Delete key:\n" + str + "\n\nFrom: " + str2 + " storage").setPositiveButton("Delete", new DialogInterface.OnClickListener() { // from class: o.aBh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                ActivityC5653aAY.EZpvd(this.OLrzqt, str, str2, linearLayout, linearLayout2, dialogInterface, i);
            }
        }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).show();
    }

    public static final void EZpvd(ActivityC5653aAY activityC5653aAY, java.lang.String str, java.lang.String str2, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, android.content.DialogInterface dialogInterface, int i) {
        activityC5653aAY.KWHzl(str, str2);
        linearLayout.removeView(linearLayout2);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        pUU.KWHzl("PasskeyKeyStoreDebug", "Deleting raw entry: " + str + " from " + str2);
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "passkey")) {
            KWHzl().edit().remove(str).apply();
        } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) TtmlNode.TAG_METADATA)) {
            EZpvd().edit().remove(str).apply();
        }
        java.lang.String str3 = "✅ Deleted: " + str;
        android.widget.TextView textView = this.AEQbTJ;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(str3);
        android.widget.Toast.makeText(this, "Entry deleted", 0).show();
        pUU.KWHzl("PasskeyKeyStoreDebug", str3);
    }

    public final void OLrzqt() {
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairOLrzqt = C5714aBg.copydefault.OLrzqt(this);
        java.lang.String str = "✅ Deleted ALL passkeys\nPasskey storage: " + pairOLrzqt.component1().intValue() + " entries removed\nMetadata storage: " + pairOLrzqt.component2().intValue() + " entries removed";
        android.widget.TextView textView = this.AEQbTJ;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(str);
        android.widget.Toast.makeText(this, "All passkeys deleted", 0).show();
        pUU.KWHzl("PasskeyKeyStoreDebug", str);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
