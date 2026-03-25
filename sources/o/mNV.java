package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.debugbox.track.model.EventData;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class mNV extends AbstractActivityC33041mov {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public mMV AEQbTJ;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mNV.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull EventData eventData) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(eventData, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) mNV.class);
            intent.putExtra("event", eventData);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String strAEQbTJ;
        java.lang.String strEZpvd;
        java.lang.String strEZpvd2;
        java.util.Map<java.lang.String, java.lang.String> mapOLrzqt;
        super.onCreate(bundle);
        mMV mmv = (mMV) DataBindingUtil.setContentView(this, C31976mKx.Application.AEQbTJ);
        this.AEQbTJ = mmv;
        mMV mmv2 = null;
        if (mmv == null) {
            Intrinsics.gEmmrt("");
            mmv = null;
        }
        setSupportActionBar(mmv.djBIcL);
        mMV mmv3 = this.AEQbTJ;
        if (mmv3 == null) {
            Intrinsics.gEmmrt("");
            mmv3 = null;
        }
        mmv3.djBIcL.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.mNW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mNV.AEQbTJ(this.copydefault, view);
            }
        });
        mMV mmv4 = this.AEQbTJ;
        if (mmv4 == null) {
            Intrinsics.gEmmrt("");
            mmv4 = null;
        }
        mmv4.getRoot().setPadding(0, C33570myu.AEQbTJ((android.content.Context) this), 0, 0);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            EventData eventData = (EventData) intent.getParcelableExtra("event");
            mMV mmv5 = this.AEQbTJ;
            if (mmv5 == null) {
                Intrinsics.gEmmrt("");
                mmv5 = null;
            }
            android.widget.TextView textView = mmv5.KWHzl;
            int i = C31976mKx.FragmentManager.AEQbTJ;
            if (eventData == null || (strAEQbTJ = eventData.AEQbTJ()) == null) {
                strAEQbTJ = "";
            }
            textView.setText(C33069mpW.KWHzl(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("event", strAEQbTJ))));
            mMV mmv6 = this.AEQbTJ;
            if (mmv6 == null) {
                Intrinsics.gEmmrt("");
                mmv6 = null;
            }
            android.widget.TextView textView2 = mmv6.AEQbTJ;
            int i2 = C31976mKx.FragmentManager.OLrzqt;
            if (eventData == null || (strEZpvd = eventData.EZpvd()) == null) {
                strEZpvd = "";
            }
            textView2.setText(C33069mpW.KWHzl(this, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(AppsFlyerProperties.CHANNEL, strEZpvd))));
            mMV mmv7 = this.AEQbTJ;
            if (mmv7 == null) {
                Intrinsics.gEmmrt("");
                mmv7 = null;
            }
            android.widget.TextView textView3 = mmv7.copydefault;
            int i3 = C31976mKx.FragmentManager.KWHzl;
            if (eventData == null || (strEZpvd2 = C32073mOm.EZpvd(eventData.KWHzl())) == null) {
                strEZpvd2 = "";
            }
            textView3.setText(C33069mpW.KWHzl(this, i3, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("state", strEZpvd2))));
            mMV mmv8 = this.AEQbTJ;
            if (mmv8 == null) {
                Intrinsics.gEmmrt("");
                mmv8 = null;
            }
            mmv8.OLrzqt.setText(getString(C31976mKx.FragmentManager.copydefault));
            if (eventData == null || (mapOLrzqt = eventData.OLrzqt()) == null) {
                mMV mmv9 = this.AEQbTJ;
                if (mmv9 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    mmv2 = mmv9;
                }
                mmv2.EZpvd.setVisibility(8);
                Unit unit = Unit.INSTANCE;
                return;
            }
            mMV mmv10 = this.AEQbTJ;
            if (mmv10 == null) {
                Intrinsics.gEmmrt("");
            } else {
                mmv2 = mmv10;
            }
            C5474Td c5474Td = mmv2.EZpvd;
            java.util.Map mapIsConnected = C56424yEw.isConnected(mapOLrzqt);
            Intrinsics.copydefault(mapIsConnected, "");
            c5474Td.AEQbTJ(new JSONObject(mapIsConnected));
            c5474Td.copydefault();
        }
    }

    public static final void AEQbTJ(mNV mnv, android.view.View view) {
        mnv.onBackPressed();
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
