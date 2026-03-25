package o;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.okinc.components.track.TrackChannel;
import java.text.DecimalFormat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.pzN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39808pzN extends android.view.View {
    public Activity AEQbTJ;
    public java.util.ArrayList<pAQ> AYXKKw;
    public android.graphics.Path AhwBna;
    public int AkhnZx;
    public float AuCTel;
    public final float AuCTelauCTel;
    public android.view.GestureDetector AubY;
    public float AwvSrB;
    public final float AxsJAY;
    public android.graphics.Paint AxsJAYaxsJAY;
    public float AxsJAYsNCnLh;
    public InterfaceC35984oKz DAIeex;
    public java.lang.String DTwDnp;
    public final float DbNXlk;
    public float EZpvd;
    public boolean KWHzl;
    public float ODWQjV;
    public boolean OLrzqt;
    public java.lang.String ORxRYg;
    public final float OcIXYQ;
    public java.lang.String QKVWgx;
    public float QKudOq;
    public float QOLQEE;
    public float QUSxYX;
    public float QVAiDq;
    public final float QbewEr;
    public android.graphics.Paint QfsBiF;
    public float RJOkX;
    public float RcXXUw;
    public float RlQdEF;
    public float UeEOUB;
    public DashPathEffect aKErDB;
    public float accept;
    public float copydefault;
    public float dNCPSb;
    public android.graphics.Path djBIcL;
    public android.view.ScaleGestureDetector djSkpj;
    public int dvKsVJ;
    public float dxcTrN;
    public int ejfBZ;
    public android.graphics.Path fARcdN;
    public Application fFgQHt;
    public android.graphics.Path fIwbmz;
    public float fJNWhG;
    public float fZBcTu;
    public int fetchVPNInfo;
    public android.graphics.Paint finit;
    public android.graphics.Path flVtFt;
    public java.util.ArrayList<pAQ> fvQaOB;
    public android.graphics.Paint gEmmrt;
    public android.graphics.Paint gGvvIC;
    public final float gHZMYf;
    public android.graphics.Path gasjUx;
    public java.lang.String getFieldNames;
    public final float getNewProxyInstance;
    public java.util.ArrayList<TaskDescription> giSNqX;
    public final float gkJEwt;
    public android.graphics.Paint hDKMBd;
    public float hUfVAv;
    public android.graphics.Path iRxXKY;
    public float iZzfmt;
    public final float isConnected;
    public DecimalFormat iwGUEr;
    public final float sSMYrx;
    public final float uzCIH;
    public java.util.ArrayList<TaskDescription> valueOf;
    public android.graphics.Path values;
    public float wlaJM;
    public int zLjUOn;
    public java.lang.String zsXlph;
    public int zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        float f = this.QKudOq * this.fZBcTu;
        this.dxcTrN = f;
        float f2 = this.AxsJAYsNCnLh;
        if (f > f2) {
            this.dxcTrN = f2;
        }
        float f3 = this.dxcTrN;
        float f4 = this.RlQdEF;
        if (f3 < f4) {
            this.dxcTrN = f4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd(float f, boolean z) {
        float f2 = this.QVAiDq;
        float f3 = (f2 - f) / f2;
        float f4 = this.wlaJM;
        float f5 = this.RcXXUw;
        float f6 = (f3 * f4) + f5;
        if (f6 < f5) {
            return f5;
        }
        float f7 = f5 + f4;
        return f6 > f7 ? f7 : f6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC35984oKz EZpvd() {
        return this.DAIeex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault(float f) {
        return (this.accept / 2.0f) + ((f - this.fJNWhG) * this.copydefault) + this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMapDepthBizDelegate(@NotNull InterfaceC35984oKz interfaceC35984oKz) {
        Intrinsics.checkNotNullParameter(interfaceC35984oKz, "");
        this.DAIeex = interfaceC35984oKz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39808pzN(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.getFieldNames = "";
        this.iwGUEr = new DecimalFormat("0.00%");
        this.AYXKKw = new java.util.ArrayList<>();
        this.fvQaOB = new java.util.ArrayList<>();
        this.valueOf = new java.util.ArrayList<>();
        this.giSNqX = new java.util.ArrayList<>();
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.RcXXUw = C33052mpF.EZpvd(10.0f, r9);
        this.fZBcTu = 1.0f;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AuCTel = C33052mpF.AYXKKw(12.0f, r1);
        this.AkhnZx = ContextCompat.getColor(getContext(), C52761wXj.Activity.aappFQ);
        this.fetchVPNInfo = ContextCompat.getColor(getContext(), C52761wXj.Activity.fZc);
        this.dvKsVJ = ContextCompat.getColor(getContext(), C52761wXj.Activity.iLWfRf);
        this.ejfBZ = ContextCompat.getColor(getContext(), C52761wXj.Activity.EZpvd);
        this.zLjUOn = ContextCompat.getColor(getContext(), C52761wXj.Activity.DcMfJKDCKfqPDCfLja);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        float fEZpvd = C33052mpF.EZpvd(0.5f, context2);
        this.isConnected = fEZpvd;
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        float fEZpvd2 = C33052mpF.EZpvd(1.5f, context3);
        this.uzCIH = fEZpvd2;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.getNewProxyInstance = C33052mpF.EZpvd(3.0f, r4);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.QbewEr = C33052mpF.EZpvd(6.0f, r4);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.gkJEwt = C33052mpF.EZpvd(24.0f, r4);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.DbNXlk = C33052mpF.EZpvd(8.0f, r4);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.QOLQEE = C33052mpF.EZpvd(88.0f, r4);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AuCTelauCTel = C33052mpF.EZpvd(60.0f, r4);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.sSMYrx = C33052mpF.EZpvd(4.0f, r4);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.gHZMYf = C33052mpF.EZpvd(8.0f, r4);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AxsJAY = C33052mpF.EZpvd(2.0f, r4);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.OcIXYQ = C33052mpF.AYXKKw(12.0f, r4);
        this.zuBGHE = ContextCompat.getColor(getContext(), C52761wXj.Activity.iLWfRf);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AwvSrB = C33052mpF.EZpvd(6.0f, r2);
        this.AhwBna = new android.graphics.Path();
        this.djBIcL = new android.graphics.Path();
        this.values = new android.graphics.Path();
        this.gasjUx = new android.graphics.Path();
        this.flVtFt = new android.graphics.Path();
        this.iRxXKY = new android.graphics.Path();
        this.fIwbmz = new android.graphics.Path();
        this.fARcdN = new android.graphics.Path();
        this.RlQdEF = 1.0f;
        this.ORxRYg = "";
        this.zsXlph = "";
        this.aKErDB = new DashPathEffect(new float[]{10.0f, 10.0f}, 1.0f);
        this.DTwDnp = "";
        this.QKVWgx = "";
        android.graphics.Paint paint = new android.graphics.Paint();
        this.QfsBiF = paint;
        paint.setStrokeWidth(fEZpvd);
        android.graphics.Paint paint2 = this.QfsBiF;
        if (paint2 != null) {
            paint2.setColor(this.fetchVPNInfo);
        }
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.gEmmrt = paint3;
        paint3.setStrokeWidth(fEZpvd2);
        android.graphics.Paint paint4 = this.gEmmrt;
        if (paint4 != null) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            paint4.setColor(C33512mxp.tradeRiseGraph$default(c33512mxp, context4, 0.0f, 2, null));
        }
        android.graphics.Paint paint5 = this.gEmmrt;
        if (paint5 != null) {
            paint5.setStyle(Paint.Style.STROKE);
        }
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.gGvvIC = paint6;
        paint6.setStrokeWidth(fEZpvd2);
        android.graphics.Paint paint7 = this.gGvvIC;
        if (paint7 != null) {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            paint7.setColor(C33512mxp.tradeFallGraph$default(c33512mxp2, context5, 0.0f, 2, null));
        }
        android.graphics.Paint paint8 = this.gGvvIC;
        if (paint8 != null) {
            paint8.setStyle(Paint.Style.STROKE);
        }
        android.graphics.Paint paint9 = new android.graphics.Paint();
        this.hDKMBd = paint9;
        C33512mxp c33512mxp3 = C33512mxp.AEQbTJ;
        android.content.Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        paint9.setColor(c33512mxp3.zLjUOn(context6, 0.1f));
        android.graphics.Paint paint10 = this.hDKMBd;
        if (paint10 != null) {
            paint10.setStyle(Paint.Style.FILL);
        }
        android.graphics.Paint paint11 = new android.graphics.Paint();
        this.AxsJAYaxsJAY = paint11;
        paint11.setColor(this.AkhnZx);
        android.graphics.Paint paint12 = this.AxsJAYaxsJAY;
        if (paint12 != null) {
            paint12.setStyle(Paint.Style.FILL);
        }
        android.graphics.Paint paint13 = this.AxsJAYaxsJAY;
        if (paint13 != null) {
            paint13.setTextSize(this.AuCTel);
        }
        android.graphics.Paint paint14 = this.AxsJAYaxsJAY;
        if (paint14 != null) {
            paint14.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
        }
        android.graphics.Paint paint15 = new android.graphics.Paint();
        this.finit = paint15;
        paint15.setStyle(Paint.Style.FILL);
        this.AEQbTJ = new Activity();
        this.fFgQHt = new Application();
        android.content.Context context7 = getContext();
        Activity activity = this.AEQbTJ;
        Intrinsics.copydefault(activity);
        this.AubY = new android.view.GestureDetector(context7, activity);
        android.content.Context context8 = getContext();
        Application application = this.fFgQHt;
        Intrinsics.copydefault(application);
        this.djSkpj = new android.view.ScaleGestureDetector(context8, application);
        float f = 3;
        android.graphics.Paint paint16 = this.AxsJAYaxsJAY;
        this.RJOkX = f * (paint16 != null ? paint16.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) : 0.0f);
        this.DAIeex = new C39806pzL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39808pzN(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.getFieldNames = "";
        this.iwGUEr = new DecimalFormat("0.00%");
        this.AYXKKw = new java.util.ArrayList<>();
        this.fvQaOB = new java.util.ArrayList<>();
        this.valueOf = new java.util.ArrayList<>();
        this.giSNqX = new java.util.ArrayList<>();
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.RcXXUw = C33052mpF.EZpvd(10.0f, r8);
        this.fZBcTu = 1.0f;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AuCTel = C33052mpF.AYXKKw(12.0f, r9);
        this.AkhnZx = ContextCompat.getColor(getContext(), C52761wXj.Activity.aappFQ);
        this.fetchVPNInfo = ContextCompat.getColor(getContext(), C52761wXj.Activity.fZc);
        this.dvKsVJ = ContextCompat.getColor(getContext(), C52761wXj.Activity.iLWfRf);
        this.ejfBZ = ContextCompat.getColor(getContext(), C52761wXj.Activity.EZpvd);
        this.zLjUOn = ContextCompat.getColor(getContext(), C52761wXj.Activity.DcMfJKDCKfqPDCfLja);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        float fEZpvd = C33052mpF.EZpvd(0.5f, context2);
        this.isConnected = fEZpvd;
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        float fEZpvd2 = C33052mpF.EZpvd(1.5f, context3);
        this.uzCIH = fEZpvd2;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.getNewProxyInstance = C33052mpF.EZpvd(3.0f, r3);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.QbewEr = C33052mpF.EZpvd(6.0f, r3);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.gkJEwt = C33052mpF.EZpvd(24.0f, r3);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.DbNXlk = C33052mpF.EZpvd(8.0f, r3);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.QOLQEE = C33052mpF.EZpvd(88.0f, r3);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AuCTelauCTel = C33052mpF.EZpvd(60.0f, r3);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.sSMYrx = C33052mpF.EZpvd(4.0f, r3);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.gHZMYf = C33052mpF.EZpvd(8.0f, r3);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AxsJAY = C33052mpF.EZpvd(2.0f, r3);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.OcIXYQ = C33052mpF.AYXKKw(12.0f, r3);
        this.zuBGHE = ContextCompat.getColor(getContext(), C52761wXj.Activity.iLWfRf);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AwvSrB = C33052mpF.EZpvd(6.0f, r1);
        this.AhwBna = new android.graphics.Path();
        this.djBIcL = new android.graphics.Path();
        this.values = new android.graphics.Path();
        this.gasjUx = new android.graphics.Path();
        this.flVtFt = new android.graphics.Path();
        this.iRxXKY = new android.graphics.Path();
        this.fIwbmz = new android.graphics.Path();
        this.fARcdN = new android.graphics.Path();
        this.RlQdEF = 1.0f;
        this.ORxRYg = "";
        this.zsXlph = "";
        this.aKErDB = new DashPathEffect(new float[]{10.0f, 10.0f}, 1.0f);
        this.DTwDnp = "";
        this.QKVWgx = "";
        android.graphics.Paint paint = new android.graphics.Paint();
        this.QfsBiF = paint;
        paint.setStrokeWidth(fEZpvd);
        android.graphics.Paint paint2 = this.QfsBiF;
        if (paint2 != null) {
            paint2.setColor(this.fetchVPNInfo);
        }
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.gEmmrt = paint3;
        paint3.setStrokeWidth(fEZpvd2);
        android.graphics.Paint paint4 = this.gEmmrt;
        if (paint4 != null) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            paint4.setColor(C33512mxp.tradeRiseGraph$default(c33512mxp, context4, 0.0f, 2, null));
        }
        android.graphics.Paint paint5 = this.gEmmrt;
        if (paint5 != null) {
            paint5.setStyle(Paint.Style.STROKE);
        }
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.gGvvIC = paint6;
        paint6.setStrokeWidth(fEZpvd2);
        android.graphics.Paint paint7 = this.gGvvIC;
        if (paint7 != null) {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            paint7.setColor(C33512mxp.tradeFallGraph$default(c33512mxp2, context5, 0.0f, 2, null));
        }
        android.graphics.Paint paint8 = this.gGvvIC;
        if (paint8 != null) {
            paint8.setStyle(Paint.Style.STROKE);
        }
        android.graphics.Paint paint9 = new android.graphics.Paint();
        this.hDKMBd = paint9;
        C33512mxp c33512mxp3 = C33512mxp.AEQbTJ;
        android.content.Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        paint9.setColor(c33512mxp3.zLjUOn(context6, 0.1f));
        android.graphics.Paint paint10 = this.hDKMBd;
        if (paint10 != null) {
            paint10.setStyle(Paint.Style.FILL);
        }
        android.graphics.Paint paint11 = new android.graphics.Paint();
        this.AxsJAYaxsJAY = paint11;
        paint11.setColor(this.AkhnZx);
        android.graphics.Paint paint12 = this.AxsJAYaxsJAY;
        if (paint12 != null) {
            paint12.setStyle(Paint.Style.FILL);
        }
        android.graphics.Paint paint13 = this.AxsJAYaxsJAY;
        if (paint13 != null) {
            paint13.setTextSize(this.AuCTel);
        }
        android.graphics.Paint paint14 = this.AxsJAYaxsJAY;
        if (paint14 != null) {
            paint14.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
        }
        android.graphics.Paint paint15 = new android.graphics.Paint();
        this.finit = paint15;
        paint15.setStyle(Paint.Style.FILL);
        this.AEQbTJ = new Activity();
        this.fFgQHt = new Application();
        android.content.Context context7 = getContext();
        Activity activity = this.AEQbTJ;
        Intrinsics.copydefault(activity);
        this.AubY = new android.view.GestureDetector(context7, activity);
        android.content.Context context8 = getContext();
        Application application = this.fFgQHt;
        Intrinsics.copydefault(application);
        this.djSkpj = new android.view.ScaleGestureDetector(context8, application);
        float f = 3;
        android.graphics.Paint paint16 = this.AxsJAYaxsJAY;
        this.RJOkX = f * (paint16 != null ? paint16.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) : 0.0f);
        this.DAIeex = new C39806pzL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39808pzN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.getFieldNames = "";
        this.iwGUEr = new DecimalFormat("0.00%");
        this.AYXKKw = new java.util.ArrayList<>();
        this.fvQaOB = new java.util.ArrayList<>();
        this.valueOf = new java.util.ArrayList<>();
        this.giSNqX = new java.util.ArrayList<>();
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.RcXXUw = C33052mpF.EZpvd(10.0f, r7);
        this.fZBcTu = 1.0f;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AuCTel = C33052mpF.AYXKKw(12.0f, r8);
        this.AkhnZx = ContextCompat.getColor(getContext(), C52761wXj.Activity.aappFQ);
        this.fetchVPNInfo = ContextCompat.getColor(getContext(), C52761wXj.Activity.fZc);
        this.dvKsVJ = ContextCompat.getColor(getContext(), C52761wXj.Activity.iLWfRf);
        this.ejfBZ = ContextCompat.getColor(getContext(), C52761wXj.Activity.EZpvd);
        this.zLjUOn = ContextCompat.getColor(getContext(), C52761wXj.Activity.DcMfJKDCKfqPDCfLja);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        float fEZpvd = C33052mpF.EZpvd(0.5f, context2);
        this.isConnected = fEZpvd;
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        float fEZpvd2 = C33052mpF.EZpvd(1.5f, context3);
        this.uzCIH = fEZpvd2;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.getNewProxyInstance = C33052mpF.EZpvd(3.0f, r2);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.QbewEr = C33052mpF.EZpvd(6.0f, r2);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.gkJEwt = C33052mpF.EZpvd(24.0f, r2);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.DbNXlk = C33052mpF.EZpvd(8.0f, r2);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.QOLQEE = C33052mpF.EZpvd(88.0f, r2);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AuCTelauCTel = C33052mpF.EZpvd(60.0f, r2);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.sSMYrx = C33052mpF.EZpvd(4.0f, r2);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.gHZMYf = C33052mpF.EZpvd(8.0f, r2);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AxsJAY = C33052mpF.EZpvd(2.0f, r2);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.OcIXYQ = C33052mpF.AYXKKw(12.0f, r2);
        this.zuBGHE = ContextCompat.getColor(getContext(), C52761wXj.Activity.iLWfRf);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AwvSrB = C33052mpF.EZpvd(6.0f, r9);
        this.AhwBna = new android.graphics.Path();
        this.djBIcL = new android.graphics.Path();
        this.values = new android.graphics.Path();
        this.gasjUx = new android.graphics.Path();
        this.flVtFt = new android.graphics.Path();
        this.iRxXKY = new android.graphics.Path();
        this.fIwbmz = new android.graphics.Path();
        this.fARcdN = new android.graphics.Path();
        this.RlQdEF = 1.0f;
        this.ORxRYg = "";
        this.zsXlph = "";
        this.aKErDB = new DashPathEffect(new float[]{10.0f, 10.0f}, 1.0f);
        this.DTwDnp = "";
        this.QKVWgx = "";
        android.graphics.Paint paint = new android.graphics.Paint();
        this.QfsBiF = paint;
        paint.setStrokeWidth(fEZpvd);
        android.graphics.Paint paint2 = this.QfsBiF;
        if (paint2 != null) {
            paint2.setColor(this.fetchVPNInfo);
        }
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.gEmmrt = paint3;
        paint3.setStrokeWidth(fEZpvd2);
        android.graphics.Paint paint4 = this.gEmmrt;
        if (paint4 != null) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            paint4.setColor(C33512mxp.tradeRiseGraph$default(c33512mxp, context4, 0.0f, 2, null));
        }
        android.graphics.Paint paint5 = this.gEmmrt;
        if (paint5 != null) {
            paint5.setStyle(Paint.Style.STROKE);
        }
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.gGvvIC = paint6;
        paint6.setStrokeWidth(fEZpvd2);
        android.graphics.Paint paint7 = this.gGvvIC;
        if (paint7 != null) {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            paint7.setColor(C33512mxp.tradeFallGraph$default(c33512mxp2, context5, 0.0f, 2, null));
        }
        android.graphics.Paint paint8 = this.gGvvIC;
        if (paint8 != null) {
            paint8.setStyle(Paint.Style.STROKE);
        }
        android.graphics.Paint paint9 = new android.graphics.Paint();
        this.hDKMBd = paint9;
        C33512mxp c33512mxp3 = C33512mxp.AEQbTJ;
        android.content.Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        paint9.setColor(c33512mxp3.zLjUOn(context6, 0.1f));
        android.graphics.Paint paint10 = this.hDKMBd;
        if (paint10 != null) {
            paint10.setStyle(Paint.Style.FILL);
        }
        android.graphics.Paint paint11 = new android.graphics.Paint();
        this.AxsJAYaxsJAY = paint11;
        paint11.setColor(this.AkhnZx);
        android.graphics.Paint paint12 = this.AxsJAYaxsJAY;
        if (paint12 != null) {
            paint12.setStyle(Paint.Style.FILL);
        }
        android.graphics.Paint paint13 = this.AxsJAYaxsJAY;
        if (paint13 != null) {
            paint13.setTextSize(this.AuCTel);
        }
        android.graphics.Paint paint14 = this.AxsJAYaxsJAY;
        if (paint14 != null) {
            paint14.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
        }
        android.graphics.Paint paint15 = new android.graphics.Paint();
        this.finit = paint15;
        paint15.setStyle(Paint.Style.FILL);
        this.AEQbTJ = new Activity();
        this.fFgQHt = new Application();
        android.content.Context context7 = getContext();
        Activity activity = this.AEQbTJ;
        Intrinsics.copydefault(activity);
        this.AubY = new android.view.GestureDetector(context7, activity);
        android.content.Context context8 = getContext();
        Application application = this.fFgQHt;
        Intrinsics.copydefault(application);
        this.djSkpj = new android.view.ScaleGestureDetector(context8, application);
        float f = 3;
        android.graphics.Paint paint16 = this.AxsJAYaxsJAY;
        this.RJOkX = f * (paint16 != null ? paint16.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) : 0.0f);
        this.DAIeex = new C39806pzL();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setData(java.lang.String str, java.lang.String str2, float f, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.ArrayList<pAQ> arrayList, @NotNull java.util.ArrayList<pAQ> arrayList2) {
        java.lang.String str5;
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        this.fJNWhG = f;
        this.getFieldNames = str3;
        this.RlQdEF = C33129mqd.djBIcL(str4);
        this.AYXKKw.clear();
        this.fvQaOB.clear();
        this.fvQaOB.addAll(arrayList2);
        this.AYXKKw.addAll(arrayList);
        java.lang.String str6 = this.DTwDnp;
        if (str6 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str6) || (str5 = this.QKVWgx) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str5)) {
            if (str == null) {
                str = "";
            }
            this.DTwDnp = str;
            if (str2 == null) {
                str2 = "";
            }
            this.QKVWgx = str2;
            this.fZBcTu = 1.0f;
        } else if (!Intrinsics.EZpvd((java.lang.Object) this.DTwDnp, (java.lang.Object) str) || !Intrinsics.EZpvd((java.lang.Object) this.QKVWgx, (java.lang.Object) str2) || this.fZBcTu == 1.0f) {
            if (str == null) {
                str = "";
            }
            this.DTwDnp = str;
            if (str2 == null) {
            }
            this.QKVWgx = str2;
            this.fZBcTu = 1.0f;
        }
        OLrzqt();
        postInvalidate();
    }

    public final void OLrzqt() {
        EZpvd().copydefault(C56424yEw.gEmmrt(C56390yDp.OLrzqt("InstId", this.DTwDnp), C56390yDp.OLrzqt("InstType", this.QKVWgx)));
        float fAEQbTJ = EZpvd().AEQbTJ(this.fJNWhG, this.DTwDnp, this.QKVWgx);
        this.fJNWhG = fAEQbTJ;
        if (fAEQbTJ == 0.0f) {
            if (this.AYXKKw.size() != 0 && this.fvQaOB.size() != 0) {
                this.fJNWhG = (C33129mqd.djBIcL(java.lang.Double.valueOf(this.AYXKKw.get(0).copydefault())) + C33129mqd.djBIcL(java.lang.Double.valueOf(this.fvQaOB.get(0).copydefault()))) / 2.0f;
            } else if (this.AYXKKw.size() != 0) {
                this.fJNWhG = C33129mqd.djBIcL(java.lang.Double.valueOf(this.AYXKKw.get(0).copydefault()));
            } else if (this.fvQaOB.size() != 0) {
                this.fJNWhG = C33129mqd.djBIcL(java.lang.Double.valueOf(this.fvQaOB.get(0).copydefault()));
            }
        }
        if (this.AYXKKw.size() > 0 && this.fvQaOB.size() > 0) {
            if (java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.AYXKKw.get(r0.size() - 1).copydefault())) - this.fJNWhG) >= java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.fvQaOB.get(r2.size() - 1).copydefault())) - this.fJNWhG)) {
                this.QKudOq = java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.fvQaOB.get(r0.size() - 1).copydefault())) - this.fJNWhG);
                this.AxsJAYsNCnLh = java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.AYXKKw.get(r0.size() - 1).copydefault())) - this.fJNWhG);
            } else {
                this.QKudOq = java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.AYXKKw.get(r0.size() - 1).copydefault())) - this.fJNWhG);
                this.AxsJAYsNCnLh = java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.fvQaOB.get(r0.size() - 1).copydefault())) - this.fJNWhG);
            }
        } else if (this.AYXKKw.size() == 0 && this.fvQaOB.size() > 0) {
            this.QKudOq = java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.fvQaOB.get(r0.size() - 1).copydefault())) - this.fJNWhG);
            this.AxsJAYsNCnLh = java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.fvQaOB.get(r0.size() - 1).copydefault())) - this.fJNWhG);
        } else if (this.AYXKKw.size() > 0 && this.fvQaOB.size() == 0) {
            this.QKudOq = java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.AYXKKw.get(r0.size() - 1).copydefault())) - this.fJNWhG);
            this.AxsJAYsNCnLh = java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.AYXKKw.get(r0.size() - 1).copydefault())) - this.fJNWhG);
        }
        copydefault();
        float f = this.accept;
        float f2 = this.dxcTrN;
        this.copydefault = f / (2.0f * f2);
        this.QVAiDq = EZpvd(f2);
        KWHzl();
    }

    public final void KWHzl() {
        if (this.QVAiDq == 0.0f || this.dxcTrN == 0.0f) {
            return;
        }
        this.valueOf.clear();
        this.giSNqX.clear();
        if (this.AYXKKw.size() != 0) {
            if (this.AYXKKw.size() != 1) {
                int size = this.AYXKKw.size();
                for (int i = 0; i < size; i++) {
                    float fCopydefault = copydefault(C33129mqd.djBIcL(java.lang.Double.valueOf(this.AYXKKw.get(i).copydefault())));
                    float fEZpvd = EZpvd(this.AYXKKw.get(i).EZpvd(), true);
                    if (this.AYXKKw.get(i).copydefault() <= this.fJNWhG) {
                        this.valueOf.add(new TaskDescription(this, fCopydefault, fEZpvd, this.AYXKKw.get(i).KWHzl(), limitFmtAmount$default(this, C33129mqd.AEQbTJ(java.lang.Float.valueOf(this.AYXKKw.get(i).EZpvd())), 0, 2, null), C33129mqd.djBIcL(java.lang.Double.valueOf(this.AYXKKw.get(i).copydefault()))));
                    }
                }
            } else if (java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.AYXKKw.get(0).copydefault())) - this.fJNWhG) <= this.dxcTrN) {
                this.valueOf.add(new TaskDescription(this, copydefault(C33129mqd.djBIcL(java.lang.Double.valueOf(this.AYXKKw.get(0).copydefault()))), EZpvd(this.AYXKKw.get(0).EZpvd(), true), this.AYXKKw.get(0).KWHzl(), limitFmtAmount$default(this, C33129mqd.AEQbTJ(java.lang.Float.valueOf(this.AYXKKw.get(0).EZpvd())), 0, 2, null), C33129mqd.djBIcL(java.lang.Double.valueOf(this.AYXKKw.get(0).copydefault()))));
            }
        }
        if (this.fvQaOB.size() != 0) {
            if (this.fvQaOB.size() == 1) {
                if (java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.fvQaOB.get(0).copydefault())) - this.fJNWhG) <= this.dxcTrN) {
                    this.ORxRYg = this.fvQaOB.get(0).KWHzl();
                    this.giSNqX.add(new TaskDescription(this, copydefault(C33129mqd.djBIcL(java.lang.Double.valueOf(this.fvQaOB.get(0).copydefault()))), EZpvd(this.fvQaOB.get(0).EZpvd(), false), this.fvQaOB.get(0).KWHzl(), limitFmtAmount$default(this, C33129mqd.AEQbTJ(java.lang.Float.valueOf(this.fvQaOB.get(0).EZpvd())), 0, 2, null), C33129mqd.djBIcL(java.lang.Double.valueOf(this.fvQaOB.get(0).copydefault()))));
                    return;
                }
                return;
            }
            int size2 = this.fvQaOB.size();
            for (int i2 = 0; i2 < size2; i2++) {
                float fCopydefault2 = copydefault(C33129mqd.djBIcL(java.lang.Double.valueOf(this.fvQaOB.get(i2).copydefault())));
                float fEZpvd2 = EZpvd(this.fvQaOB.get(i2).EZpvd(), false);
                if (this.fvQaOB.get(i2).copydefault() >= this.fJNWhG) {
                    this.giSNqX.add(new TaskDescription(this, fCopydefault2, fEZpvd2, this.fvQaOB.get(i2).KWHzl(), limitFmtAmount$default(this, C33129mqd.AEQbTJ(java.lang.Float.valueOf(this.fvQaOB.get(i2).EZpvd())), 0, 2, null), C33129mqd.djBIcL(java.lang.Double.valueOf(this.fvQaOB.get(i2).copydefault()))));
                }
            }
        }
    }

    public final float EZpvd(float f) {
        float fEZpvd;
        float fEZpvd2 = 0.0f;
        if (this.AYXKKw.size() > 0) {
            int size = this.AYXKKw.size();
            fEZpvd = 0.0f;
            for (int i = 0; i < size; i++) {
                if (java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.AYXKKw.get(i).copydefault())) - this.fJNWhG) <= f) {
                    fEZpvd = this.AYXKKw.get(i).EZpvd();
                }
            }
        } else {
            fEZpvd = 0.0f;
        }
        if (this.fvQaOB.size() > 0) {
            int size2 = this.fvQaOB.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(this.fvQaOB.get(i2).copydefault())) - this.fJNWhG) <= f) {
                    fEZpvd2 = this.fvQaOB.get(i2).EZpvd();
                }
            }
        }
        return fEZpvd > fEZpvd2 ? fEZpvd : fEZpvd2;
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        java.lang.System.currentTimeMillis();
        this.flVtFt.reset();
        this.djBIcL.reset();
        this.gasjUx.reset();
        this.AhwBna.reset();
        this.values.reset();
        this.iRxXKY.reset();
        this.fIwbmz.reset();
        this.fARcdN.reset();
        float f = this.accept;
        this.copydefault = f / (this.dxcTrN * 2.0f);
        float f2 = this.wlaJM;
        this.EZpvd = f2 / this.QVAiDq;
        if (this.fJNWhG == 0.0f) {
            return;
        }
        float f3 = this.UeEOUB;
        float f4 = this.RcXXUw;
        android.graphics.Paint paint = this.QfsBiF;
        Intrinsics.copydefault(paint);
        float f5 = (f / 2.0f) + f3;
        canvas.drawLine(f5, 0.0f, f5, f2 + f4, paint);
        copydefault(canvas);
        EZpvd(canvas);
        AEQbTJ(canvas);
    }

    public final void AEQbTJ(android.graphics.Canvas canvas) {
        if (this.fJNWhG == 0.0f) {
            return;
        }
        android.graphics.Paint paint = this.AxsJAYaxsJAY;
        if (paint != null) {
            paint.setTextSize(this.AuCTel);
        }
        android.graphics.Paint paint2 = this.AxsJAYaxsJAY;
        if (paint2 != null) {
            paint2.setColor(this.AkhnZx);
        }
        java.lang.String strKWHzl = EZpvd().KWHzl(this.fJNWhG, this.DTwDnp, this.QKVWgx);
        if (canvas != null) {
            float f = this.UeEOUB;
            float width = getWidth() / 2.0f;
            android.graphics.Paint paint3 = this.AxsJAYaxsJAY;
            float fMeasureText = paint3 != null ? paint3.measureText(strKWHzl) : 0.0f;
            float f2 = this.RcXXUw;
            float f3 = this.wlaJM;
            float f4 = this.RJOkX / 2.0f;
            android.graphics.Paint paint4 = this.AxsJAYaxsJAY;
            Intrinsics.copydefault(paint4);
            canvas.drawText(strKWHzl, (f + width) - (fMeasureText / 2.0f), f2 + f3 + f4, paint4);
        }
        float f5 = this.fJNWhG;
        float f6 = this.dxcTrN;
        this.zsXlph = EZpvd().KWHzl(f5 - f6, this.DTwDnp, this.QKVWgx);
        this.ORxRYg = EZpvd().KWHzl(f5 + f6, this.DTwDnp, this.QKVWgx);
        if (canvas != null) {
            java.lang.String str = this.zsXlph;
            float f7 = this.UeEOUB;
            float f8 = this.gkJEwt;
            float f9 = this.RcXXUw;
            float f10 = this.wlaJM;
            float f11 = this.RJOkX / 2.0f;
            android.graphics.Paint paint5 = this.AxsJAYaxsJAY;
            Intrinsics.copydefault(paint5);
            canvas.drawText(str, f7 + f8, f9 + f10 + f11, paint5);
        }
        if (canvas != null) {
            java.lang.String str2 = this.ORxRYg;
            float f12 = this.UeEOUB;
            float f13 = this.accept;
            float f14 = this.dNCPSb;
            float f15 = this.gkJEwt;
            android.graphics.Paint paint6 = this.AxsJAYaxsJAY;
            Intrinsics.copydefault(paint6);
            float fMeasureText2 = paint6.measureText(this.ORxRYg);
            float f16 = this.RcXXUw;
            float f17 = this.wlaJM;
            float f18 = this.RJOkX / 2.0f;
            android.graphics.Paint paint7 = this.AxsJAYaxsJAY;
            Intrinsics.copydefault(paint7);
            canvas.drawText(str2, (((f12 + f13) + f14) - f15) - fMeasureText2, f16 + f17 + f18, paint7);
        }
        float f19 = (this.QVAiDq - this.QUSxYX) / 6.0f;
        android.graphics.Paint paint8 = this.AxsJAYaxsJAY;
        if (paint8 != null) {
            paint8.setTextAlign(Paint.Align.LEFT);
        }
        int i = 0;
        while (i < 6) {
            i++;
            float f20 = i * f19;
            java.lang.String strLimitFmtAmount$default = limitFmtAmount$default(this, C33129mqd.AEQbTJ(java.lang.Float.valueOf(f20)), 0, 2, null);
            if (canvas != null) {
                float f21 = this.UeEOUB;
                float f22 = this.accept;
                android.graphics.Paint paint9 = this.AxsJAYaxsJAY;
                Intrinsics.copydefault(paint9);
                float fMeasureText3 = paint9.measureText(strLimitFmtAmount$default);
                float f23 = this.DbNXlk;
                float f24 = this.RcXXUw;
                float f25 = this.wlaJM;
                float f26 = this.EZpvd;
                android.graphics.Paint paint10 = this.AxsJAYaxsJAY;
                Intrinsics.copydefault(paint10);
                canvas.drawText(strLimitFmtAmount$default, ((f21 + f22) - fMeasureText3) - f23, (f24 + f25) - (f20 * f26), paint10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03bb, code lost:
    
        r1.setColor(KWHzl(r18.ejfBZ, 0.5f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03c6, code lost:
    
        if (r19 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03c8, code lost:
    
        r1 = r18.fIwbmz;
        r2 = r18.finit;
        kotlin.jvm.internal.Intrinsics.copydefault(r2);
        r19.drawPath(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03d2, code lost:
    
        r1 = r18.finit;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03d6, code lost:
    
        if (r1 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03d8, code lost:
    
        r3 = o.C33512mxp.AEQbTJ;
        r4 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "getContext(...)");
        r1.setColor(r3.EZpvd(r4, 0.3f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03eb, code lost:
    
        if (r19 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03ed, code lost:
    
        r1 = r18.QbewEr;
        r3 = r18.finit;
        kotlin.jvm.internal.Intrinsics.copydefault(r3);
        r19.drawCircle(r11, r10, r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03f7, code lost:
    
        r1 = r18.finit;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03f9, code lost:
    
        if (r1 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03fb, code lost:
    
        r3 = o.C33512mxp.AEQbTJ;
        r4 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "getContext(...)");
        r1.setColor(o.C33512mxp.getRiseUpColor$default(r3, r4, 0.0f, 2, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x040c, code lost:
    
        if (r19 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x040e, code lost:
    
        r1 = r18.getNewProxyInstance;
        r2 = r18.finit;
        kotlin.jvm.internal.Intrinsics.copydefault(r2);
        r19.drawCircle(r11, r10, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0419, code lost:
    
        if (r8 == (-1)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x041b, code lost:
    
        r1 = r18.valueOf.get(r8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r9);
        copydefault(r19, r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x035d, code lost:
    
        r18.fIwbmz.moveTo(r18.UeEOUB, 0.0f);
        r2 = r11 - 1;
        r18.fIwbmz.lineTo(r2, 0.0f);
        r18.fIwbmz.lineTo(r2, r18.RcXXUw + r18.wlaJM);
        r18.fIwbmz.lineTo(r18.UeEOUB, r18.RcXXUw + r18.wlaJM);
        r18.fIwbmz.close();
        r1 = r18.finit;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x038a, code lost:
    
        if (r1 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x038c, code lost:
    
        r1.setPathEffect(r18.aKErDB);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0391, code lost:
    
        r1 = r18.finit;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0393, code lost:
    
        if (r1 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0395, code lost:
    
        r1.setColor(r18.dvKsVJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x039a, code lost:
    
        if (r19 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x039c, code lost:
    
        r1 = r18.RcXXUw;
        r2 = r18.wlaJM;
        r6 = r18.finit;
        kotlin.jvm.internal.Intrinsics.copydefault(r6);
        r19.drawLine(r11, 0.0f, r11, r1 + r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03af, code lost:
    
        r1 = r18.finit;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03b1, code lost:
    
        if (r1 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03b3, code lost:
    
        r1.setPathEffect(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03b7, code lost:
    
        r1 = r18.finit;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03b9, code lost:
    
        if (r1 == null) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(android.graphics.Canvas canvas) {
        java.lang.String str;
        int i;
        float f;
        float f2;
        float f3;
        int i2;
        float f4;
        PathEffect pathEffect;
        if (this.valueOf.size() <= 0 || this.giSNqX.size() <= 0) {
            if (this.valueOf.size() > 0) {
                float f5 = this.ODWQjV;
                java.util.ArrayList<TaskDescription> arrayList = this.valueOf;
                if (f5 < arrayList.get(arrayList.size() - 1).KWHzl() || this.ODWQjV > this.valueOf.get(0).KWHzl()) {
                    return;
                }
            } else {
                if (this.giSNqX.size() <= 0) {
                    return;
                }
                float f6 = this.ODWQjV;
                java.util.ArrayList<TaskDescription> arrayList2 = this.giSNqX;
                if (f6 > arrayList2.get(arrayList2.size() - 1).KWHzl() || this.ODWQjV < this.giSNqX.get(0).KWHzl()) {
                    return;
                }
            }
        } else {
            if (this.ODWQjV > this.valueOf.get(0).KWHzl() && this.ODWQjV < this.giSNqX.get(0).KWHzl()) {
                return;
            }
            float f7 = this.ODWQjV;
            java.util.ArrayList<TaskDescription> arrayList3 = this.valueOf;
            if (f7 < arrayList3.get(arrayList3.size() - 1).KWHzl()) {
                return;
            }
            float f8 = this.ODWQjV;
            java.util.ArrayList<TaskDescription> arrayList4 = this.giSNqX;
            if (f8 > arrayList4.get(arrayList4.size() - 1).KWHzl()) {
                return;
            }
        }
        if (!this.KWHzl || this.OLrzqt) {
            return;
        }
        float fAbs = java.lang.Math.abs(this.ODWQjV - ((getWidth() / 2.0f) + this.UeEOUB));
        float width = (this.UeEOUB + (getWidth() / 2.0f)) - fAbs;
        float width2 = this.UeEOUB + (getWidth() / 2.0f) + fAbs;
        if (this.valueOf.size() > 0 && width <= this.valueOf.get(0).KWHzl()) {
            if (this.valueOf.size() == 1) {
                float fEZpvd = this.valueOf.get(0).EZpvd();
                android.graphics.Paint paint = this.finit;
                if (paint != null) {
                    paint.setColor(this.dvKsVJ);
                }
                android.graphics.Paint paint2 = this.finit;
                if (paint2 != null) {
                    paint2.setPathEffect(this.aKErDB);
                }
                if (canvas != null) {
                    float f9 = this.RcXXUw;
                    float f10 = this.wlaJM;
                    android.graphics.Paint paint3 = this.finit;
                    Intrinsics.copydefault(paint3);
                    f4 = fEZpvd;
                    f = 0.0f;
                    pathEffect = null;
                    str = "";
                    i = 2;
                    canvas.drawLine(width, 0.0f, width, f10 + f9, paint3);
                } else {
                    f4 = fEZpvd;
                    pathEffect = null;
                    str = "";
                    i = 2;
                    f = 0.0f;
                }
                android.graphics.Paint paint4 = this.finit;
                if (paint4 != null) {
                    paint4.setPathEffect(pathEffect);
                }
                android.graphics.Paint paint5 = this.finit;
                if (paint5 != null) {
                    C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, str);
                    paint5.setColor(c33512mxp.EZpvd(context, 0.3f));
                }
                if (canvas != null) {
                    float f11 = this.QbewEr;
                    android.graphics.Paint paint6 = this.finit;
                    Intrinsics.copydefault(paint6);
                    canvas.drawCircle(width, f4, f11, paint6);
                }
                android.graphics.Paint paint7 = this.finit;
                if (paint7 != null) {
                    C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, str);
                    paint7.setColor(C33512mxp.getRiseUpColor$default(c33512mxp2, context2, f, i, pathEffect));
                }
                if (canvas != null) {
                    float f12 = this.getNewProxyInstance;
                    android.graphics.Paint paint8 = this.finit;
                    Intrinsics.copydefault(paint8);
                    canvas.drawCircle(width, f4, f12, paint8);
                }
                this.values.moveTo(width, this.RcXXUw + this.wlaJM);
                this.values.lineTo(width, f4);
                this.values.lineTo(this.UeEOUB, f4);
                this.values.lineTo(this.UeEOUB, this.RcXXUw + this.wlaJM);
                this.values.close();
                this.fIwbmz.moveTo(this.UeEOUB, f);
                this.fIwbmz.lineTo(width, f);
                this.fIwbmz.lineTo(width, this.RcXXUw + this.wlaJM);
                this.fIwbmz.lineTo(this.UeEOUB, this.RcXXUw + this.wlaJM);
                this.fIwbmz.close();
                android.graphics.Paint paint9 = this.finit;
                if (paint9 != null) {
                    paint9.setColor(KWHzl(this.ejfBZ, 0.5f));
                }
                if (canvas != null) {
                    android.graphics.Path path = this.fIwbmz;
                    android.graphics.Paint paint10 = this.finit;
                    Intrinsics.copydefault(paint10);
                    canvas.drawPath(path, paint10);
                }
            } else {
                str = "";
                i = 2;
                f = 0.0f;
                int size = this.valueOf.size();
                float f13 = 0.0f;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    if (i3 >= size - 1) {
                        f3 = f13;
                        i2 = i4;
                        break;
                    }
                    if (i3 == 0) {
                        this.values.moveTo(this.valueOf.get(0).KWHzl(), this.RcXXUw + this.wlaJM);
                        this.values.lineTo(this.valueOf.get(0).KWHzl(), this.valueOf.get(0).EZpvd());
                    } else {
                        this.values.lineTo(this.valueOf.get(i3).KWHzl(), this.valueOf.get(i3 - 1).EZpvd());
                        this.values.lineTo(this.valueOf.get(i3).KWHzl(), this.valueOf.get(i3).EZpvd());
                    }
                    if (width <= this.valueOf.get(i3).KWHzl() && width >= this.valueOf.get(i3 + 1).KWHzl()) {
                        float fEZpvd2 = this.valueOf.get(i3).EZpvd();
                        this.values.lineTo(width, fEZpvd2);
                        this.values.lineTo(width, this.RcXXUw + this.wlaJM);
                        this.values.close();
                        i2 = i3;
                        f3 = fEZpvd2;
                        break;
                    }
                    if (i3 == this.valueOf.size() - 2) {
                        if (this.ODWQjV < (this.accept / 2.0f) + this.UeEOUB) {
                            return;
                        }
                        java.util.ArrayList<TaskDescription> arrayList5 = this.valueOf;
                        float fKWHzl = arrayList5.get(arrayList5.size() - 1).KWHzl();
                        java.util.ArrayList<TaskDescription> arrayList6 = this.valueOf;
                        float fEZpvd3 = arrayList6.get(arrayList6.size() - 1).EZpvd();
                        this.values.lineTo(fKWHzl, this.valueOf.get(i3).EZpvd());
                        this.values.lineTo(fKWHzl, fEZpvd3);
                        this.values.lineTo(fKWHzl, this.RcXXUw + this.wlaJM);
                        int size2 = this.valueOf.size();
                        this.values.close();
                        width = fKWHzl;
                        f13 = fEZpvd3;
                        i4 = size2 - 1;
                    }
                    i3++;
                }
            }
        } else {
            str = "";
            i = 2;
            f = 0.0f;
        }
        if (this.giSNqX.size() <= 0 || width2 < this.giSNqX.get(0).KWHzl()) {
            return;
        }
        if (this.giSNqX.size() == 1) {
            float fEZpvd4 = this.giSNqX.get(0).EZpvd();
            android.graphics.Paint paint11 = this.finit;
            if (paint11 != null) {
                paint11.setColor(this.dvKsVJ);
            }
            android.graphics.Paint paint12 = this.finit;
            if (paint12 != null) {
                paint12.setPathEffect(this.aKErDB);
            }
            if (canvas != null) {
                float f14 = this.RcXXUw;
                float f15 = this.wlaJM;
                android.graphics.Paint paint13 = this.finit;
                Intrinsics.copydefault(paint13);
                canvas.drawLine(width2, 0.0f, width2, f14 + f15, paint13);
            }
            android.graphics.Paint paint14 = this.finit;
            if (paint14 != null) {
                paint14.setPathEffect(null);
            }
            android.graphics.Paint paint15 = this.finit;
            if (paint15 != null) {
                C33512mxp c33512mxp3 = C33512mxp.AEQbTJ;
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, str);
                paint15.setColor(c33512mxp3.copydefault(context3, 0.3f));
            }
            if (canvas != null) {
                float f16 = this.QbewEr;
                android.graphics.Paint paint16 = this.finit;
                Intrinsics.copydefault(paint16);
                canvas.drawCircle(width2, fEZpvd4, f16, paint16);
            }
            android.graphics.Paint paint17 = this.finit;
            if (paint17 != null) {
                C33512mxp c33512mxp4 = C33512mxp.AEQbTJ;
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, str);
                paint17.setColor(C33512mxp.getFallDownColor$default(c33512mxp4, context4, f, i, null));
            }
            if (canvas != null) {
                float f17 = this.getNewProxyInstance;
                android.graphics.Paint paint18 = this.finit;
                Intrinsics.copydefault(paint18);
                canvas.drawCircle(width2, fEZpvd4, f17, paint18);
            }
            this.iRxXKY.moveTo(width2, this.RcXXUw + this.wlaJM);
            this.iRxXKY.lineTo(width2, fEZpvd4);
            this.iRxXKY.lineTo(this.UeEOUB + this.accept + this.dNCPSb, fEZpvd4);
            this.iRxXKY.lineTo(this.UeEOUB + this.accept + this.dNCPSb, this.RcXXUw + this.wlaJM);
            this.iRxXKY.close();
            this.fARcdN.moveTo(this.UeEOUB + this.accept, f);
            float f18 = width2 + 1;
            this.fARcdN.lineTo(f18, f);
            this.fARcdN.lineTo(f18, this.RcXXUw + this.wlaJM);
            this.fARcdN.lineTo(this.UeEOUB + this.accept, this.RcXXUw + this.wlaJM);
            this.fARcdN.close();
            android.graphics.Paint paint19 = this.finit;
            if (paint19 != null) {
                paint19.setColor(KWHzl(this.ejfBZ, 0.5f));
            }
            if (canvas != null) {
                android.graphics.Path path2 = this.fARcdN;
                android.graphics.Paint paint20 = this.finit;
                Intrinsics.copydefault(paint20);
                canvas.drawPath(path2, paint20);
                return;
            }
            return;
        }
        int size3 = this.giSNqX.size();
        float fEZpvd5 = f;
        int size4 = -1;
        int i5 = 0;
        while (true) {
            if (i5 >= size3 - 1) {
                f2 = fEZpvd5;
                i5 = size4;
                break;
            }
            if (i5 == 0) {
                this.iRxXKY.moveTo(this.giSNqX.get(0).KWHzl(), this.RcXXUw + this.wlaJM);
                this.iRxXKY.lineTo(this.giSNqX.get(0).KWHzl(), this.giSNqX.get(0).EZpvd());
            } else {
                this.iRxXKY.lineTo(this.giSNqX.get(i5).KWHzl(), this.giSNqX.get(i5 - 1).EZpvd());
                this.iRxXKY.lineTo(this.giSNqX.get(i5).KWHzl(), this.giSNqX.get(i5).EZpvd());
            }
            if (width2 >= this.giSNqX.get(i5).KWHzl() && width2 <= this.giSNqX.get(i5 + 1).KWHzl()) {
                float fEZpvd6 = this.giSNqX.get(i5).EZpvd();
                this.iRxXKY.lineTo(width2, fEZpvd6);
                this.iRxXKY.lineTo(width2, this.RcXXUw + this.wlaJM);
                this.iRxXKY.close();
                f2 = fEZpvd6;
                break;
            }
            if (i5 == this.giSNqX.size() - i) {
                if (this.ODWQjV > (this.accept / 2.0f) + this.UeEOUB) {
                    return;
                }
                java.util.ArrayList<TaskDescription> arrayList7 = this.giSNqX;
                float fKWHzl2 = arrayList7.get(arrayList7.size() - 1).KWHzl();
                java.util.ArrayList<TaskDescription> arrayList8 = this.giSNqX;
                fEZpvd5 = arrayList8.get(arrayList8.size() - 1).EZpvd();
                this.iRxXKY.lineTo(fKWHzl2, this.giSNqX.get(i5).EZpvd());
                this.iRxXKY.lineTo(fKWHzl2, fEZpvd5);
                this.iRxXKY.lineTo(fKWHzl2, this.RcXXUw + this.wlaJM);
                this.iRxXKY.close();
                width2 = fKWHzl2;
                size4 = this.giSNqX.size() - 1;
            }
            i5++;
        }
        this.fARcdN.moveTo(this.UeEOUB + this.accept, f);
        float f19 = 1 + width2;
        this.fARcdN.lineTo(f19, f);
        this.fARcdN.lineTo(f19, this.RcXXUw + this.wlaJM);
        this.fARcdN.lineTo(this.UeEOUB + this.accept, this.RcXXUw + this.wlaJM);
        this.fARcdN.close();
        android.graphics.Paint paint21 = this.finit;
        if (paint21 != null) {
            paint21.setPathEffect(this.aKErDB);
        }
        android.graphics.Paint paint22 = this.finit;
        if (paint22 != null) {
            paint22.setColor(this.dvKsVJ);
        }
        if (canvas != null) {
            float f20 = this.RcXXUw;
            float f21 = this.wlaJM;
            android.graphics.Paint paint23 = this.finit;
            Intrinsics.copydefault(paint23);
            canvas.drawLine(width2, 0.0f, width2, f20 + f21, paint23);
        }
        android.graphics.Paint paint24 = this.finit;
        if (paint24 != null) {
            paint24.setPathEffect(null);
        }
        android.graphics.Paint paint25 = this.finit;
        if (paint25 != null) {
            paint25.setColor(KWHzl(this.ejfBZ, 0.5f));
        }
        if (canvas != null) {
            android.graphics.Path path3 = this.fARcdN;
            android.graphics.Paint paint26 = this.finit;
            Intrinsics.copydefault(paint26);
            canvas.drawPath(path3, paint26);
        }
        android.graphics.Paint paint27 = this.finit;
        if (paint27 != null) {
            C33512mxp c33512mxp5 = C33512mxp.AEQbTJ;
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, str);
            paint27.setColor(c33512mxp5.copydefault(context5, 0.3f));
        }
        if (canvas != null) {
            float f22 = this.QbewEr;
            android.graphics.Paint paint28 = this.finit;
            Intrinsics.copydefault(paint28);
            canvas.drawCircle(width2, f2, f22, paint28);
        }
        android.graphics.Paint paint29 = this.finit;
        if (paint29 != null) {
            C33512mxp c33512mxp6 = C33512mxp.AEQbTJ;
            android.content.Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, str);
            paint29.setColor(C33512mxp.getFallDownColor$default(c33512mxp6, context6, f, i, null));
        }
        if (canvas != null) {
            float f23 = this.getNewProxyInstance;
            android.graphics.Paint paint30 = this.finit;
            Intrinsics.copydefault(paint30);
            canvas.drawCircle(width2, f2, f23, paint30);
        }
        TaskDescription taskDescription = this.giSNqX.get(i5);
        Intrinsics.checkNotNullExpressionValue(taskDescription, str);
        copydefault(canvas, taskDescription, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(android.graphics.Canvas canvas, TaskDescription taskDescription, boolean z) {
        java.lang.String str;
        float f;
        float f2;
        float fKWHzl;
        float fKWHzl2;
        float f3;
        float fEZpvd;
        float f4;
        float fEZpvd2;
        float f5;
        float f6;
        float f7;
        android.graphics.Paint paint;
        float f8;
        float fEZpvd3;
        float f9;
        float fKWHzl3;
        float f10;
        float f11;
        float f12;
        float fEZpvd4;
        float f13;
        float fEZpvd5;
        float f14;
        float f15;
        float f16;
        android.graphics.Paint paint2;
        float f17;
        float fEZpvd6;
        android.graphics.Paint paint3 = this.AxsJAYaxsJAY;
        if (paint3 != null) {
            paint3.setTextSize(this.OcIXYQ);
        }
        android.graphics.Paint paint4 = this.AxsJAYaxsJAY;
        if (paint4 != null) {
            paint4.setColor(this.zuBGHE);
        }
        android.graphics.Paint paint5 = this.AxsJAYaxsJAY;
        if (paint5 != null) {
            paint5.setAntiAlias(true);
        }
        float f18 = 0.0f;
        if (z) {
            float fAEQbTJ = taskDescription.AEQbTJ();
            float f19 = this.fJNWhG;
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Float.valueOf((fAEQbTJ - f19) / f19));
            str = C33129mqd.djBIcL(strGEmmrt) > 0.0f ? Marker.ANY_NON_NULL_MARKER : "";
            java.lang.String percent$default = pTB.formatPercent$default(pTB.OLrzqt((java.lang.Object) strGEmmrt), 0, null, 3, null);
            java.lang.String str2 = getContext().getString(C35964oKf.Fragment.DUUtXg) + "  " + str + percent$default;
            java.lang.String str3 = getContext().getString(C35964oKf.Fragment.DGUQLIekVPG) + "  " + taskDescription.copydefault();
            java.lang.String str4 = getContext().getString(C35964oKf.Fragment.DrqXHJ) + "  " + taskDescription.OLrzqt();
            android.graphics.Paint paint6 = this.AxsJAYaxsJAY;
            Intrinsics.copydefault(paint6);
            float fMeasureText = paint6.measureText("M");
            android.graphics.Paint paint7 = this.AxsJAYaxsJAY;
            Intrinsics.copydefault(paint7);
            float fMeasureText2 = paint7.measureText(str2);
            android.graphics.Paint paint8 = this.AxsJAYaxsJAY;
            Intrinsics.copydefault(paint8);
            float fMeasureText3 = paint8.measureText(str3);
            android.graphics.Paint paint9 = this.AxsJAYaxsJAY;
            Intrinsics.copydefault(paint9);
            float fMeasureText4 = paint9.measureText(str4);
            if (fMeasureText2 <= fMeasureText3) {
                fMeasureText2 = fMeasureText3;
            }
            if (fMeasureText2 >= fMeasureText4) {
                fMeasureText4 = fMeasureText2;
            }
            float f20 = 2;
            this.QOLQEE = fMeasureText4 + (this.gHZMYf * f20);
            float fAbs = java.lang.Math.abs(taskDescription.KWHzl() - this.UeEOUB);
            float fAbs2 = java.lang.Math.abs(taskDescription.KWHzl() - (this.UeEOUB + (getWidth() / 2.0f)));
            float f21 = this.QOLQEE;
            if (fAbs2 > f21) {
                fKWHzl3 = taskDescription.KWHzl() + this.getNewProxyInstance + this.AxsJAY;
                f9 = this.QOLQEE;
            } else if (fAbs > f21) {
                float fKWHzl4 = (taskDescription.KWHzl() - this.getNewProxyInstance) - this.AxsJAY;
                f10 = fKWHzl4;
                f11 = fKWHzl4 - this.QOLQEE;
                f12 = this.QOLQEE;
                if (fAbs2 < f12 || fAbs >= f12) {
                    fEZpvd4 = taskDescription.EZpvd();
                    f13 = this.AuCTelauCTel;
                    if (fEZpvd4 >= f13 / 2.0f) {
                        float f22 = this.RcXXUw;
                        float f23 = this.wlaJM;
                        float fEZpvd7 = taskDescription.EZpvd();
                        float f24 = this.AuCTelauCTel;
                        if ((f22 + f23) - fEZpvd7 < f24 / 2.0f) {
                            fEZpvd5 = this.RcXXUw + this.wlaJM;
                            f14 = f24;
                        } else {
                            float fEZpvd8 = taskDescription.EZpvd();
                            f13 = this.AuCTelauCTel;
                            f18 = fEZpvd8 - (f13 / 2.0f);
                        }
                    }
                    f15 = f13 + f18;
                    f16 = f18;
                    paint2 = this.finit;
                    if (paint2 != null) {
                        paint2.setColor(this.zLjUOn);
                    }
                    if (canvas != null) {
                        float f25 = this.sSMYrx;
                        android.graphics.Paint paint10 = this.finit;
                        Intrinsics.copydefault(paint10);
                        canvas.drawRoundRect(f11, f16, f10, f15, f25, f25, paint10);
                    }
                    float f26 = this.gHZMYf;
                    float f27 = f16 + f26;
                    float f28 = f27 + fMeasureText;
                    float f29 = this.AwvSrB;
                    float f30 = f27 + f29 + (fMeasureText * f20);
                    float f31 = f27 + (f29 * f20) + (fMeasureText * 3);
                    if (C55296xhK.AEQbTJ(this)) {
                        android.graphics.Paint paint11 = this.AxsJAYaxsJAY;
                        if (paint11 != null) {
                            paint11.setTextAlign(Paint.Align.LEFT);
                        }
                        if (canvas != null) {
                            android.graphics.Paint paint12 = this.AxsJAYaxsJAY;
                            Intrinsics.copydefault(paint12);
                            canvas.drawText(str2, f11 + f26, f28, paint12);
                        }
                        if (canvas != null) {
                            android.graphics.Paint paint13 = this.AxsJAYaxsJAY;
                            Intrinsics.copydefault(paint13);
                            canvas.drawText(str3, f11 + f26, f30, paint13);
                        }
                        if (canvas != null) {
                            android.graphics.Paint paint14 = this.AxsJAYaxsJAY;
                            Intrinsics.copydefault(paint14);
                            canvas.drawText(str4, f11 + f26, f31, paint14);
                            return;
                        }
                        return;
                    }
                    android.graphics.Paint paint15 = this.AxsJAYaxsJAY;
                    if (paint15 != null) {
                        paint15.setTextAlign(Paint.Align.RIGHT);
                    }
                    if (canvas != null) {
                        float f32 = this.gHZMYf;
                        android.graphics.Paint paint16 = this.AxsJAYaxsJAY;
                        Intrinsics.copydefault(paint16);
                        canvas.drawText(str2, f10 - f32, f28, paint16);
                    }
                    if (canvas != null) {
                        float f33 = this.gHZMYf;
                        android.graphics.Paint paint17 = this.AxsJAYaxsJAY;
                        Intrinsics.copydefault(paint17);
                        canvas.drawText(str3, f10 - f33, f30, paint17);
                    }
                    if (canvas != null) {
                        float f34 = this.gHZMYf;
                        android.graphics.Paint paint18 = this.AxsJAYaxsJAY;
                        Intrinsics.copydefault(paint18);
                        canvas.drawText(str4, f10 - f34, f31, paint18);
                        return;
                    }
                    return;
                }
                if (taskDescription.EZpvd() > this.RcXXUw + (this.wlaJM / 2.0f)) {
                    fEZpvd5 = (taskDescription.EZpvd() - this.getNewProxyInstance) - this.AxsJAY;
                    f14 = this.AuCTelauCTel;
                } else {
                    fEZpvd6 = taskDescription.EZpvd() + this.getNewProxyInstance + this.AxsJAY;
                    f17 = this.AuCTelauCTel + fEZpvd6;
                    f16 = fEZpvd6;
                    f15 = f17;
                    paint2 = this.finit;
                    if (paint2 != null) {
                    }
                    if (canvas != null) {
                    }
                    float f262 = this.gHZMYf;
                    float f272 = f16 + f262;
                    float f282 = f272 + fMeasureText;
                    float f292 = this.AwvSrB;
                    float f302 = f272 + f292 + (fMeasureText * f20);
                    float f312 = f272 + (f292 * f20) + (fMeasureText * 3);
                    if (C55296xhK.AEQbTJ(this)) {
                    }
                }
                float f35 = fEZpvd5 - f14;
                f17 = fEZpvd5;
                fEZpvd6 = f35;
                f16 = fEZpvd6;
                f15 = f17;
                paint2 = this.finit;
                if (paint2 != null) {
                }
                if (canvas != null) {
                }
                float f2622 = this.gHZMYf;
                float f2722 = f16 + f2622;
                float f2822 = f2722 + fMeasureText;
                float f2922 = this.AwvSrB;
                float f3022 = f2722 + f2922 + (fMeasureText * f20);
                float f3122 = f2722 + (f2922 * f20) + (fMeasureText * 3);
                if (C55296xhK.AEQbTJ(this)) {
                }
            } else {
                float fKWHzl5 = taskDescription.KWHzl();
                f9 = this.QOLQEE;
                fKWHzl3 = fKWHzl5 - (f9 / 2.0f);
            }
            f11 = fKWHzl3;
            f10 = f9 + fKWHzl3;
            f12 = this.QOLQEE;
            if (fAbs2 < f12) {
                fEZpvd4 = taskDescription.EZpvd();
                f13 = this.AuCTelauCTel;
                if (fEZpvd4 >= f13 / 2.0f) {
                }
                f15 = f13 + f18;
                f16 = f18;
            }
            paint2 = this.finit;
            if (paint2 != null) {
            }
            if (canvas != null) {
            }
            float f26222 = this.gHZMYf;
            float f27222 = f16 + f26222;
            float f28222 = f27222 + fMeasureText;
            float f29222 = this.AwvSrB;
            float f30222 = f27222 + f29222 + (fMeasureText * f20);
            float f31222 = f27222 + (f29222 * f20) + (fMeasureText * 3);
            if (C55296xhK.AEQbTJ(this)) {
            }
        } else {
            float fAEQbTJ2 = taskDescription.AEQbTJ();
            float f36 = this.fJNWhG;
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(java.lang.Float.valueOf((fAEQbTJ2 - f36) / f36));
            str = C33129mqd.djBIcL(strGEmmrt2) > 0.0f ? Marker.ANY_NON_NULL_MARKER : "";
            java.lang.String percent$default2 = pTB.formatPercent$default(pTB.OLrzqt((java.lang.Object) strGEmmrt2), 0, null, 3, null);
            java.lang.String str5 = getContext().getString(C35964oKf.Fragment.DUUtXg) + "  " + str + percent$default2;
            java.lang.String str6 = getContext().getString(C35964oKf.Fragment.DGUQLIekVPG) + "  " + taskDescription.copydefault();
            java.lang.String str7 = getContext().getString(C35964oKf.Fragment.DrqXHJ) + "  " + taskDescription.OLrzqt();
            android.graphics.Paint paint19 = this.AxsJAYaxsJAY;
            Intrinsics.copydefault(paint19);
            float fMeasureText5 = paint19.measureText("M");
            android.graphics.Paint paint20 = this.AxsJAYaxsJAY;
            Intrinsics.copydefault(paint20);
            float fMeasureText6 = paint20.measureText(str5);
            android.graphics.Paint paint21 = this.AxsJAYaxsJAY;
            Intrinsics.copydefault(paint21);
            float fMeasureText7 = paint21.measureText(str6);
            android.graphics.Paint paint22 = this.AxsJAYaxsJAY;
            Intrinsics.copydefault(paint22);
            float fMeasureText8 = paint22.measureText(str7);
            if (fMeasureText6 <= fMeasureText7) {
                fMeasureText6 = fMeasureText7;
            }
            if (fMeasureText6 >= fMeasureText8) {
                fMeasureText8 = fMeasureText6;
            }
            float f37 = 2;
            this.QOLQEE = fMeasureText8 + (this.gHZMYf * f37);
            float fAbs3 = java.lang.Math.abs(taskDescription.KWHzl() - (this.UeEOUB + (getWidth() / 2.0f)));
            float fAbs4 = java.lang.Math.abs(taskDescription.KWHzl() - ((this.UeEOUB + this.accept) + this.dNCPSb));
            float f38 = this.QOLQEE;
            if (fAbs3 > f38) {
                fKWHzl2 = (taskDescription.KWHzl() - this.getNewProxyInstance) - this.AxsJAY;
                fKWHzl = fKWHzl2 - this.QOLQEE;
            } else if (fAbs4 > f38) {
                fKWHzl = this.AxsJAY + taskDescription.KWHzl() + this.getNewProxyInstance;
                fKWHzl2 = this.QOLQEE + fKWHzl;
            } else {
                float fKWHzl6 = taskDescription.KWHzl();
                float f39 = this.QOLQEE;
                float f40 = fKWHzl6 - (f39 / 2.0f);
                f = f40;
                f2 = f39 + f40;
                f3 = this.QOLQEE;
                if (fAbs4 < f3 || fAbs3 >= f3) {
                    fEZpvd = taskDescription.EZpvd();
                    f4 = this.AuCTelauCTel;
                    if (fEZpvd >= f4 / 2.0f) {
                        float f41 = this.RcXXUw;
                        float f42 = this.wlaJM;
                        float fEZpvd9 = taskDescription.EZpvd();
                        float f43 = this.AuCTelauCTel;
                        if ((f41 + f42) - fEZpvd9 < f43 / 2.0f) {
                            fEZpvd2 = this.RcXXUw + this.wlaJM;
                            f5 = f43;
                        } else {
                            float fEZpvd10 = taskDescription.EZpvd();
                            f4 = this.AuCTelauCTel;
                            f18 = fEZpvd10 - (f4 / 2.0f);
                        }
                    }
                    f6 = f4 + f18;
                    f7 = f18;
                    paint = this.finit;
                    if (paint != null) {
                        paint.setColor(this.zLjUOn);
                    }
                    if (canvas != null) {
                        float f44 = this.sSMYrx;
                        android.graphics.Paint paint23 = this.finit;
                        Intrinsics.copydefault(paint23);
                        canvas.drawRoundRect(f, f7, f2, f6, f44, f44, paint23);
                    }
                    float f45 = this.gHZMYf;
                    float f46 = f7 + f45;
                    float f47 = f46 + fMeasureText5;
                    float f48 = this.AwvSrB;
                    float f49 = f46 + f48 + (fMeasureText5 * f37);
                    float f50 = f46 + (f48 * f37) + (fMeasureText5 * 3);
                    if (C55296xhK.AEQbTJ(this)) {
                        android.graphics.Paint paint24 = this.AxsJAYaxsJAY;
                        if (paint24 != null) {
                            paint24.setTextAlign(Paint.Align.LEFT);
                        }
                        if (canvas != null) {
                            android.graphics.Paint paint25 = this.AxsJAYaxsJAY;
                            Intrinsics.copydefault(paint25);
                            canvas.drawText(str5, f + f45, f47, paint25);
                        }
                        if (canvas != null) {
                            android.graphics.Paint paint26 = this.AxsJAYaxsJAY;
                            Intrinsics.copydefault(paint26);
                            canvas.drawText(str6, f + f45, f49, paint26);
                        }
                        if (canvas != null) {
                            android.graphics.Paint paint27 = this.AxsJAYaxsJAY;
                            Intrinsics.copydefault(paint27);
                            canvas.drawText(str7, f + f45, f50, paint27);
                            return;
                        }
                        return;
                    }
                    android.graphics.Paint paint28 = this.AxsJAYaxsJAY;
                    if (paint28 != null) {
                        paint28.setTextAlign(Paint.Align.RIGHT);
                    }
                    if (canvas != null) {
                        float f51 = this.gHZMYf;
                        android.graphics.Paint paint29 = this.AxsJAYaxsJAY;
                        Intrinsics.copydefault(paint29);
                        canvas.drawText(str5, f2 - f51, f47, paint29);
                    }
                    if (canvas != null) {
                        float f52 = this.gHZMYf;
                        android.graphics.Paint paint30 = this.AxsJAYaxsJAY;
                        Intrinsics.copydefault(paint30);
                        canvas.drawText(str6, f2 - f52, f49, paint30);
                    }
                    if (canvas != null) {
                        float f53 = this.gHZMYf;
                        android.graphics.Paint paint31 = this.AxsJAYaxsJAY;
                        Intrinsics.copydefault(paint31);
                        canvas.drawText(str7, f2 - f53, f50, paint31);
                        return;
                    }
                    return;
                }
                if (taskDescription.EZpvd() > this.RcXXUw + (this.wlaJM / 2.0f)) {
                    fEZpvd2 = (taskDescription.EZpvd() - this.getNewProxyInstance) - this.AxsJAY;
                    f5 = this.AuCTelauCTel;
                } else {
                    fEZpvd3 = taskDescription.EZpvd() + this.getNewProxyInstance + this.AxsJAY;
                    f8 = this.AuCTelauCTel + fEZpvd3;
                    f7 = fEZpvd3;
                    f6 = f8;
                    paint = this.finit;
                    if (paint != null) {
                    }
                    if (canvas != null) {
                    }
                    float f452 = this.gHZMYf;
                    float f462 = f7 + f452;
                    float f472 = f462 + fMeasureText5;
                    float f482 = this.AwvSrB;
                    float f492 = f462 + f482 + (fMeasureText5 * f37);
                    float f502 = f462 + (f482 * f37) + (fMeasureText5 * 3);
                    if (C55296xhK.AEQbTJ(this)) {
                    }
                }
                float f54 = fEZpvd2 - f5;
                f8 = fEZpvd2;
                fEZpvd3 = f54;
                f7 = fEZpvd3;
                f6 = f8;
                paint = this.finit;
                if (paint != null) {
                }
                if (canvas != null) {
                }
                float f4522 = this.gHZMYf;
                float f4622 = f7 + f4522;
                float f4722 = f4622 + fMeasureText5;
                float f4822 = this.AwvSrB;
                float f4922 = f4622 + f4822 + (fMeasureText5 * f37);
                float f5022 = f4622 + (f4822 * f37) + (fMeasureText5 * 3);
                if (C55296xhK.AEQbTJ(this)) {
                }
            }
            f2 = fKWHzl2;
            f = fKWHzl;
            f3 = this.QOLQEE;
            if (fAbs4 < f3) {
                fEZpvd = taskDescription.EZpvd();
                f4 = this.AuCTelauCTel;
                if (fEZpvd >= f4 / 2.0f) {
                }
                f6 = f4 + f18;
                f7 = f18;
            }
            paint = this.finit;
            if (paint != null) {
            }
            if (canvas != null) {
            }
            float f45222 = this.gHZMYf;
            float f46222 = f7 + f45222;
            float f47222 = f46222 + fMeasureText5;
            float f48222 = this.AwvSrB;
            float f49222 = f46222 + f48222 + (fMeasureText5 * f37);
            float f50222 = f46222 + (f48222 * f37) + (fMeasureText5 * 3);
            if (C55296xhK.AEQbTJ(this)) {
            }
        }
    }

    public final void copydefault(android.graphics.Canvas canvas) {
        float fEZpvd = 0.0f;
        if (this.QVAiDq <= 0.0f) {
            return;
        }
        if (this.valueOf.size() != 0) {
            if (this.valueOf.size() != 1) {
                int size = this.valueOf.size();
                float fEZpvd2 = 0.0f;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Float.valueOf(this.valueOf.get(i).AEQbTJ())) - this.fJNWhG) <= this.dxcTrN) {
                        if (i == 0 || (i != 0 && this.valueOf.get(i).AEQbTJ() <= this.fJNWhG && this.valueOf.get(i - 1).AEQbTJ() > this.fJNWhG)) {
                            this.AhwBna.moveTo(this.valueOf.get(i).KWHzl(), this.valueOf.get(i).EZpvd());
                            this.djBIcL.moveTo(this.valueOf.get(i).KWHzl(), this.RcXXUw + this.wlaJM);
                            this.djBIcL.lineTo(this.valueOf.get(i).KWHzl(), this.valueOf.get(i).EZpvd());
                            fEZpvd2 = this.valueOf.get(i).EZpvd();
                        } else if (i == this.valueOf.size() - 1) {
                            java.util.ArrayList<TaskDescription> arrayList = this.valueOf;
                            this.zsXlph = arrayList.get(arrayList.size() - 1).copydefault();
                            this.AhwBna.lineTo(this.valueOf.get(i).KWHzl(), fEZpvd2);
                            this.AhwBna.lineTo(this.valueOf.get(i).KWHzl(), this.valueOf.get(i).EZpvd());
                            if (canvas != null) {
                                android.graphics.Path path = this.AhwBna;
                                android.graphics.Paint paint = this.gEmmrt;
                                Intrinsics.copydefault(paint);
                                canvas.drawPath(path, paint);
                            }
                            this.djBIcL.lineTo(this.valueOf.get(i).KWHzl(), fEZpvd2);
                            this.djBIcL.lineTo(this.valueOf.get(i).KWHzl(), this.valueOf.get(i).EZpvd());
                            this.djBIcL.lineTo(this.valueOf.get(i).KWHzl(), this.RcXXUw + this.wlaJM);
                            this.djBIcL.close();
                            android.graphics.Paint paint2 = this.hDKMBd;
                            if (paint2 != null) {
                                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                                android.content.Context context = getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "");
                                paint2.setColor(c33512mxp.zLjUOn(context, 0.1f));
                            }
                            if (canvas != null) {
                                android.graphics.Path path2 = this.djBIcL;
                                android.graphics.Paint paint3 = this.hDKMBd;
                                Intrinsics.copydefault(paint3);
                                canvas.drawPath(path2, paint3);
                            }
                        } else {
                            this.AhwBna.lineTo(this.valueOf.get(i).KWHzl(), fEZpvd2);
                            this.AhwBna.lineTo(this.valueOf.get(i).KWHzl(), this.valueOf.get(i).EZpvd());
                            this.djBIcL.lineTo(this.valueOf.get(i).KWHzl(), fEZpvd2);
                            this.djBIcL.lineTo(this.valueOf.get(i).KWHzl(), this.valueOf.get(i).EZpvd());
                            fEZpvd2 = this.valueOf.get(i).EZpvd();
                        }
                        i++;
                    } else if (i > 0) {
                        int i2 = i - 1;
                        if (i2 < 0) {
                            this.zsXlph = this.valueOf.get(0).copydefault();
                        } else {
                            this.zsXlph = this.valueOf.get(i2).copydefault();
                        }
                        this.AhwBna.lineTo(this.UeEOUB, fEZpvd2);
                        if (canvas != null) {
                            android.graphics.Path path3 = this.AhwBna;
                            android.graphics.Paint paint4 = this.gEmmrt;
                            Intrinsics.copydefault(paint4);
                            canvas.drawPath(path3, paint4);
                        }
                        this.djBIcL.lineTo(this.UeEOUB, fEZpvd2);
                        this.djBIcL.lineTo(this.UeEOUB, this.RcXXUw + this.wlaJM);
                        this.djBIcL.close();
                        android.graphics.Paint paint5 = this.hDKMBd;
                        if (paint5 != null) {
                            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                            android.content.Context context2 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "");
                            paint5.setColor(c33512mxp2.zLjUOn(context2, 0.1f));
                        }
                        if (canvas != null) {
                            android.graphics.Path path4 = this.djBIcL;
                            android.graphics.Paint paint6 = this.hDKMBd;
                            Intrinsics.copydefault(paint6);
                            canvas.drawPath(path4, paint6);
                        }
                    }
                }
            } else if (java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Float.valueOf(this.valueOf.get(0).AEQbTJ())) - this.fJNWhG) <= this.dxcTrN) {
                this.zsXlph = this.valueOf.get(0).copydefault();
                this.AhwBna.moveTo(this.valueOf.get(0).KWHzl(), this.valueOf.get(0).EZpvd());
                this.AhwBna.lineTo(this.UeEOUB, this.valueOf.get(0).EZpvd());
                if (canvas != null) {
                    android.graphics.Path path5 = this.AhwBna;
                    android.graphics.Paint paint7 = this.gEmmrt;
                    Intrinsics.copydefault(paint7);
                    canvas.drawPath(path5, paint7);
                }
                this.djBIcL.moveTo(this.UeEOUB, this.valueOf.get(0).EZpvd());
                this.djBIcL.lineTo(this.UeEOUB, this.RcXXUw + this.wlaJM);
                this.djBIcL.lineTo(this.valueOf.get(0).KWHzl(), this.RcXXUw + this.wlaJM);
                this.djBIcL.lineTo(this.valueOf.get(0).KWHzl(), this.valueOf.get(0).EZpvd());
                this.djBIcL.close();
                android.graphics.Paint paint8 = this.hDKMBd;
                if (paint8 != null) {
                    C33512mxp c33512mxp3 = C33512mxp.AEQbTJ;
                    android.content.Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    paint8.setColor(c33512mxp3.zLjUOn(context3, 0.1f));
                }
                if (canvas != null) {
                    android.graphics.Path path6 = this.djBIcL;
                    android.graphics.Paint paint9 = this.hDKMBd;
                    Intrinsics.copydefault(paint9);
                    canvas.drawPath(path6, paint9);
                }
            }
        }
        if (this.giSNqX.size() != 0) {
            if (this.giSNqX.size() == 1) {
                if (java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Float.valueOf(this.giSNqX.get(0).AEQbTJ())) - this.fJNWhG) <= this.dxcTrN) {
                    this.ORxRYg = this.giSNqX.get(0).copydefault();
                    this.gasjUx.moveTo(this.giSNqX.get(0).KWHzl(), this.giSNqX.get(0).EZpvd());
                    this.gasjUx.lineTo(this.UeEOUB + this.accept, this.giSNqX.get(0).EZpvd());
                    if (canvas != null) {
                        android.graphics.Path path7 = this.gasjUx;
                        android.graphics.Paint paint10 = this.gGvvIC;
                        Intrinsics.copydefault(paint10);
                        canvas.drawPath(path7, paint10);
                    }
                    this.flVtFt.moveTo(this.UeEOUB + this.accept, this.giSNqX.get(0).EZpvd());
                    this.flVtFt.lineTo(this.UeEOUB + this.accept, this.RcXXUw + this.wlaJM);
                    this.flVtFt.lineTo(this.giSNqX.get(0).KWHzl(), this.RcXXUw + this.wlaJM);
                    this.flVtFt.lineTo(this.giSNqX.get(0).KWHzl(), this.giSNqX.get(0).EZpvd());
                    this.flVtFt.close();
                    android.graphics.Paint paint11 = this.hDKMBd;
                    if (paint11 != null) {
                        C33512mxp c33512mxp4 = C33512mxp.AEQbTJ;
                        android.content.Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "");
                        paint11.setColor(c33512mxp4.isConnected(context4, 0.1f));
                    }
                    if (canvas != null) {
                        android.graphics.Path path8 = this.gasjUx;
                        android.graphics.Paint paint12 = this.hDKMBd;
                        Intrinsics.copydefault(paint12);
                        canvas.drawPath(path8, paint12);
                        return;
                    }
                    return;
                }
                return;
            }
            int size2 = this.giSNqX.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Float.valueOf(this.giSNqX.get(i3).AEQbTJ())) - this.fJNWhG) > this.dxcTrN) {
                    if (i3 > 0) {
                        int i4 = i3 - 1;
                        if (i4 < 0) {
                            this.ORxRYg = this.giSNqX.get(0).copydefault();
                        } else {
                            this.ORxRYg = this.giSNqX.get(i4).copydefault();
                        }
                        this.gasjUx.lineTo(this.accept + this.UeEOUB, fEZpvd);
                        if (canvas != null) {
                            android.graphics.Path path9 = this.gasjUx;
                            android.graphics.Paint paint13 = this.gGvvIC;
                            Intrinsics.copydefault(paint13);
                            canvas.drawPath(path9, paint13);
                        }
                        this.flVtFt.lineTo(this.accept + this.UeEOUB, fEZpvd);
                        this.flVtFt.lineTo(this.accept + this.UeEOUB, this.RcXXUw + this.wlaJM);
                        this.flVtFt.close();
                        android.graphics.Paint paint14 = this.hDKMBd;
                        if (paint14 != null) {
                            C33512mxp c33512mxp5 = C33512mxp.AEQbTJ;
                            android.content.Context context5 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context5, "");
                            paint14.setColor(c33512mxp5.isConnected(context5, 0.1f));
                        }
                        if (canvas != null) {
                            android.graphics.Path path10 = this.flVtFt;
                            android.graphics.Paint paint15 = this.hDKMBd;
                            Intrinsics.copydefault(paint15);
                            canvas.drawPath(path10, paint15);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i3 == 0 || (i3 != 0 && this.giSNqX.get(i3).AEQbTJ() >= this.fJNWhG && this.giSNqX.get(i3 - 1).AEQbTJ() < this.fJNWhG)) {
                    this.gasjUx.moveTo(this.giSNqX.get(i3).KWHzl(), this.giSNqX.get(i3).EZpvd());
                    this.flVtFt.moveTo(this.giSNqX.get(i3).KWHzl(), this.RcXXUw + this.wlaJM);
                    this.flVtFt.lineTo(this.giSNqX.get(i3).KWHzl(), this.giSNqX.get(i3).EZpvd());
                    fEZpvd = this.giSNqX.get(i3).EZpvd();
                } else if (i3 == this.giSNqX.size() - 1) {
                    java.util.ArrayList<TaskDescription> arrayList2 = this.giSNqX;
                    this.ORxRYg = arrayList2.get(arrayList2.size() - 1).copydefault();
                    this.gasjUx.lineTo(this.giSNqX.get(i3).KWHzl(), fEZpvd);
                    this.gasjUx.lineTo(this.giSNqX.get(i3).KWHzl(), this.giSNqX.get(i3).EZpvd());
                    if (canvas != null) {
                        android.graphics.Path path11 = this.gasjUx;
                        android.graphics.Paint paint16 = this.gGvvIC;
                        Intrinsics.copydefault(paint16);
                        canvas.drawPath(path11, paint16);
                    }
                    this.flVtFt.lineTo(this.giSNqX.get(i3).KWHzl(), fEZpvd);
                    this.flVtFt.lineTo(this.giSNqX.get(i3).KWHzl(), this.giSNqX.get(i3).EZpvd());
                    this.flVtFt.lineTo(this.giSNqX.get(i3).KWHzl(), this.RcXXUw + this.wlaJM);
                    this.flVtFt.close();
                    android.graphics.Paint paint17 = this.hDKMBd;
                    if (paint17 != null) {
                        C33512mxp c33512mxp6 = C33512mxp.AEQbTJ;
                        android.content.Context context6 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context6, "");
                        paint17.setColor(c33512mxp6.isConnected(context6, 0.1f));
                    }
                    if (canvas != null) {
                        android.graphics.Path path12 = this.flVtFt;
                        android.graphics.Paint paint18 = this.hDKMBd;
                        Intrinsics.copydefault(paint18);
                        canvas.drawPath(path12, paint18);
                    }
                } else {
                    this.gasjUx.lineTo(this.giSNqX.get(i3).KWHzl(), fEZpvd);
                    this.gasjUx.lineTo(this.giSNqX.get(i3).KWHzl(), this.giSNqX.get(i3).EZpvd());
                    this.flVtFt.lineTo(this.giSNqX.get(i3).KWHzl(), fEZpvd);
                    this.flVtFt.lineTo(this.giSNqX.get(i3).KWHzl(), this.giSNqX.get(i3).EZpvd());
                    fEZpvd = this.giSNqX.get(i3).EZpvd();
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.accept = (i - this.UeEOUB) - this.dNCPSb;
        this.wlaJM = (i2 - this.RJOkX) - this.RcXXUw;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        android.view.GestureDetector gestureDetector = this.AubY;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        android.view.ScaleGestureDetector scaleGestureDetector = this.djSkpj;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        java.lang.Integer.valueOf(motionEvent.getPointerCount()).toString();
        if (motionEvent.getPointerCount() == 2) {
            this.OLrzqt = true;
            this.KWHzl = false;
        } else {
            this.OLrzqt = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ODWQjV = motionEvent.getX();
        } else if (action == 3 || action == 1 || action == 4) {
            this.KWHzl = false;
            this.OLrzqt = false;
            invalidate();
        } else if (action == 2) {
            this.ODWQjV = motionEvent.getX();
            if (!this.OLrzqt && !this.KWHzl) {
                return false;
            }
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.iZzfmt = motionEvent.getX();
            this.hUfVAv = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            java.lang.Math.abs(x - this.iZzfmt);
            java.lang.Math.abs(y - this.hUfVAv);
            if (!this.KWHzl && !this.OLrzqt) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: o.pzN$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public final class Activity extends GestureDetector.SimpleOnGestureListener {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(@NotNull android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            super.onLongPress(motionEvent);
            C39808pzN.this.KWHzl = true;
            C32866mlf.onEvent$default("app_hover_show", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(@NotNull android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            return super.onDoubleTapEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: o.pzN$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public final class Application implements ScaleGestureDetector.OnScaleGestureListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(@NotNull android.view.ScaleGestureDetector scaleGestureDetector) {
            Intrinsics.checkNotNullParameter(scaleGestureDetector, "");
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(@NotNull android.view.ScaleGestureDetector scaleGestureDetector) {
            Intrinsics.checkNotNullParameter(scaleGestureDetector, "");
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(@NotNull android.view.ScaleGestureDetector scaleGestureDetector) {
            Intrinsics.checkNotNullParameter(scaleGestureDetector, "");
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (scaleFactor > 1.0f) {
                C39808pzN.this.fZBcTu -= C39808pzN.this.fZBcTu * 0.1f;
                float f = C39808pzN.this.RlQdEF / C39808pzN.this.QKudOq;
                if (C39808pzN.this.fZBcTu < f) {
                    C39808pzN.this.fZBcTu = f;
                }
            } else if (scaleFactor < 1.0f) {
                C39808pzN.this.fZBcTu += C39808pzN.this.fZBcTu * 0.1f;
                float f2 = C39808pzN.this.AxsJAYsNCnLh / C39808pzN.this.QKudOq;
                if (C39808pzN.this.fZBcTu > f2) {
                    C39808pzN.this.fZBcTu = f2;
                }
            }
            C39808pzN.this.copydefault();
            C39808pzN c39808pzN = C39808pzN.this;
            c39808pzN.QVAiDq = c39808pzN.EZpvd(c39808pzN.dxcTrN);
            C39808pzN.this.KWHzl();
            C39808pzN.this.postInvalidate();
            return false;
        }
    }

    /* JADX INFO: renamed from: o.pzN$TaskDescription */
    public final class TaskDescription {
        public float AEQbTJ;
        public float AhwBna;
        public final /* synthetic */ C39808pzN EZpvd;
        public java.lang.String KWHzl;
        public float OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float EZpvd() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        public TaskDescription(C39808pzN c39808pzN, float f, @NotNull float f2, @NotNull java.lang.String str, java.lang.String str2, float f3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = c39808pzN;
            this.OLrzqt = f;
            this.AhwBna = f2;
            this.copydefault = str;
            this.KWHzl = str2;
            this.AEQbTJ = f3;
        }
    }

    public final int KWHzl(int i, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        return ((double) (1.0f - f)) < 0.001d ? i : Color.argb(java.lang.Math.round(Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static /* synthetic */ java.lang.String limitFmtAmount$default(C39808pzN c39808pzN, double d, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return c39808pzN.EZpvd(d, i);
    }

    public final java.lang.String EZpvd(double d, int i) {
        if (d < 10.0d) {
            return pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt(java.lang.Double.valueOf(d)), i, null, 2, null);
        }
        if (d < 1000.0d) {
            return pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt(java.lang.Double.valueOf(d)), 2, null, 2, null);
        }
        if (d < 1000000.0d) {
            return pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt(java.lang.Double.valueOf(d / 1000.0d)), 2, null, 2, null) + "K";
        }
        if (d < 1.0E9d) {
            return pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt(java.lang.Double.valueOf(d / 1000000.0d)), 2, null, 2, null) + "M";
        }
        if (d < 1.0E12d) {
            return pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt(java.lang.Double.valueOf(d / 1.0E9d)), 2, null, 2, null) + "B";
        }
        return pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt(java.lang.Double.valueOf(d / 1.0E12d)), 2, null, 2, null) + ExifInterface.GPS_DIRECTION_TRUE;
    }
}
