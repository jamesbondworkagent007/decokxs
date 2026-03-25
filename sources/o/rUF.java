package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C34786niy;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class rUF extends AbstractC52792wYn {
    public wYF EZpvd;
    public java.util.List<C55276xgr> KWHzl = new java.util.ArrayList();
    public java.lang.String OLrzqt = "";

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strCopydefault = copydefault(contextRequireContext, C34786niy.TaskDescription.AEQbTJ);
        C43296rmc.KWHzl("chong", strCopydefault);
        JSONArray jSONArray = new JSONArray(strCopydefault);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            java.lang.String string = jSONObject.getString("code");
            java.lang.String string2 = jSONObject.getString("regionDisplayName");
            java.util.List<C55276xgr> list = this.KWHzl;
            Intrinsics.copydefault((java.lang.Object) string2);
            list.add(new C55276xgr(string2, string, null, false, false, null, null, 124, null));
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(3);
        c52781wYc.setTitle("Region Change");
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        for (C55276xgr c55276xgr : this.KWHzl) {
            c55276xgr.copydefault(Intrinsics.EZpvd(c55276xgr.OLrzqt(), (java.lang.Object) C43655rtQ.OLrzqt.EZpvd()));
        }
        c55198xfS.setSingleOneColumnData(this.KWHzl, new yHO() { // from class: o.rUD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return rUF.EZpvd(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit EZpvd(rUF ruf, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        if (ruf.EZpvd != null) {
            java.lang.String strValueOf = java.lang.String.valueOf(c55276xgr != null ? c55276xgr.OLrzqt() : null);
            ruf.OLrzqt = strValueOf;
            pUU.KWHzl("qjf", "region = " + strValueOf);
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        C52794wYp c52794wYpAEQbTJ;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateFooter(constraintLayout);
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        wYF wyf = new wYF(context, null, 2, null);
        wyf.setType(7);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText("Confirm");
        wyf.setSecondaryText("Clear saved region");
        this.EZpvd = wyf;
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
        wYF wyf2 = this.EZpvd;
        if (wyf2 != null && (c52794wYpAEQbTJ = wyf2.AEQbTJ()) != null) {
            c52794wYpAEQbTJ.setOnClickListener(new Application(c52794wYpAEQbTJ, 1000L, this));
        }
        android.view.View view = this.EZpvd;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.topToTop = 0;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.bottomToBottom = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(view, layoutParams);
    }

    public final java.lang.String copydefault(android.content.Context context, int i) {
        try {
            java.io.InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "");
            byte[] bArr = new byte[inputStreamOpenRawResource.available()];
            inputStreamOpenRawResource.read(bArr);
            inputStreamOpenRawResource.close();
            return new java.lang.String(bArr, Charsets.UTF_8);
        } catch (java.lang.Exception unused) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ rUF EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, rUF ruf) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = ruf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                pUU.KWHzl("qjf", "selected region = " + this.EZpvd.OLrzqt);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd.OLrzqt)) {
                    C43655rtQ.OLrzqt.copydefault(this.EZpvd.OLrzqt);
                }
                this.EZpvd.dismiss();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ rUF KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, rUF ruf) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = ruf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C43655rtQ.OLrzqt.copydefault("");
                this.KWHzl.dismiss();
            }
        }
    }
}
