package o;

import android.view.View;
import android.widget.FrameLayout;
import com.amplifyframework.core.model.ModelIdentifier;
import com.fasterxml.jackson.core.JsonFactory;
import o.C5473Tc;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: renamed from: o.Td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5474Td extends android.widget.ScrollView {
    public static float OLrzqt = 18.0f;
    public int AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public float AuCTel;
    public JSONArray DbNXlk;
    public int EZpvd;
    public int KWHzl;
    public int copydefault;
    public int djBIcL;
    public JSONObject ejfBZ;
    public int fARcdN;
    public android.widget.LinearLayout fetchVPNInfo;
    public int gEmmrt;
    public android.content.Context isConnected;
    public int valueOf;
    public android.widget.HorizontalScrollView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return (this.ejfBZ == null && this.DbNXlk == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setArrayLengthColor(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setKeyColor(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setObjectKeyColor(int i) {
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValueBooleanColor(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValueNullColor(int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValueNumberColor(int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValueTextColor(int i) {
        this.gEmmrt = i;
    }

    public C5474Td(android.content.Context context) {
        super(context);
        this.copydefault = -10377423;
        this.AYXKKw = -13421773;
        this.gEmmrt = -1151165;
        this.AhwBna = -3976202;
        this.AEQbTJ = -1;
        this.EZpvd = -12543801;
        this.djBIcL = -4408744;
        this.valueOf = 32;
        this.AkhnZx = 12;
        this.KWHzl = C5473Tc.StateListAnimator.EZpvd;
        OLrzqt(context);
    }

    public C5474Td(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.copydefault = -10377423;
        this.AYXKKw = -13421773;
        this.gEmmrt = -1151165;
        this.AhwBna = -3976202;
        this.AEQbTJ = -1;
        this.EZpvd = -12543801;
        this.djBIcL = -4408744;
        this.valueOf = 32;
        this.AkhnZx = 12;
        this.KWHzl = C5473Tc.StateListAnimator.EZpvd;
        OLrzqt(context);
    }

    public C5474Td(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.copydefault = -10377423;
        this.AYXKKw = -13421773;
        this.gEmmrt = -1151165;
        this.AhwBna = -3976202;
        this.AEQbTJ = -1;
        this.EZpvd = -12543801;
        this.djBIcL = -4408744;
        this.valueOf = 32;
        this.AkhnZx = 12;
        this.KWHzl = C5473Tc.StateListAnimator.EZpvd;
        OLrzqt(context);
    }

    public final void OLrzqt(android.content.Context context) {
        this.isConnected = context;
        this.fetchVPNInfo = new android.widget.LinearLayout(this.isConnected);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.fetchVPNInfo.setLayoutParams(layoutParams);
        this.fetchVPNInfo.setOrientation(1);
        android.widget.HorizontalScrollView horizontalScrollView = new android.widget.HorizontalScrollView(this.isConnected);
        this.values = horizontalScrollView;
        horizontalScrollView.setLayoutParams(layoutParams);
        this.values.setPadding(12, 12, 12, 0);
        this.values.addView(this.fetchVPNInfo);
        addView(this.values);
    }

    public void copydefault(java.lang.String str) {
        java.lang.Object objNextValue;
        if (EZpvd()) {
            throw new java.lang.IllegalArgumentException("JsonViweLayout can not bind again.");
        }
        try {
            objNextValue = new JSONTokener(str).nextValue();
        } catch (JSONException e) {
            e.printStackTrace();
            objNextValue = null;
        }
        if (objNextValue != null && (objNextValue instanceof JSONObject)) {
            this.ejfBZ = (JSONObject) objNextValue;
        } else if (objNextValue != null && (objNextValue instanceof JSONArray)) {
            this.DbNXlk = (JSONArray) objNextValue;
        } else {
            throw new java.lang.IllegalArgumentException("jsonStr is illegal.");
        }
        OLrzqt();
    }

    public void AEQbTJ(JSONObject jSONObject) {
        if (EZpvd()) {
            throw new java.lang.IllegalArgumentException("JsonViweLayout can not bind again.");
        }
        this.ejfBZ = jSONObject;
        if (jSONObject == null) {
            throw new java.lang.IllegalArgumentException("jsonObject can not be null.");
        }
        OLrzqt();
    }

    public final void OLrzqt() {
        SW sw = new SW(this.isConnected);
        sw.copydefault(true);
        sw.AEQbTJ();
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) JsonFactory.FORMAT_NAME_JSON);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.AYXKKw), 0, spannableStringBuilder.length(), 33);
        sw.EZpvd(spannableStringBuilder);
        java.lang.Object obj = this.ejfBZ;
        if (obj == null) {
            obj = this.DbNXlk;
        }
        sw.setIconClickListener(new StateListAnimator(obj, sw, 0));
        this.fetchVPNInfo.addView(sw);
    }

    public final void KWHzl(java.lang.String str, java.lang.Object obj, SW sw, int i) {
        int i2;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
        sw.KWHzl();
        if (obj instanceof JSONObject) {
            sw.copydefault(true);
            int i3 = i + 1;
            sw.setIconClickListener(new StateListAnimator(obj, sw, i3));
            spannableStringBuilder.append((java.lang.CharSequence) str);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.AYXKKw), 0, spannableStringBuilder.length(), 33);
            sw.setCommand(KWHzl(i3));
        } else {
            spannableStringBuilder.append((java.lang.CharSequence) ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR).append((java.lang.CharSequence) str).append((java.lang.CharSequence) ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR).append((java.lang.CharSequence) ":");
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.copydefault), 0, spannableStringBuilder.length(), 33);
            if (obj instanceof JSONArray) {
                sw.copydefault(true);
                sw.setIconClickListener(new StateListAnimator(obj, sw, i + 1));
                sw.setCommand(KWHzl(i));
                spannableStringBuilder2.append((java.lang.CharSequence) ("  " + ((JSONArray) obj).length() + "  "));
                spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(this.AEQbTJ), 0, spannableStringBuilder2.length(), 33);
                sw.OLrzqt(spannableStringBuilder2);
                sw.EZpvd(this.KWHzl);
            } else {
                sw.KWHzl();
                spannableStringBuilder2.append((java.lang.CharSequence) obj.toString());
                if (obj instanceof java.lang.String) {
                    i2 = this.gEmmrt;
                } else if (obj instanceof java.lang.Boolean) {
                    i2 = this.EZpvd;
                } else {
                    i2 = obj instanceof java.lang.Number ? this.AhwBna : this.djBIcL;
                }
                spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(i2), 0, spannableStringBuilder2.length(), 33);
                sw.OLrzqt(spannableStringBuilder2);
                sw.setCommand(KWHzl(i + 1));
            }
        }
        sw.EZpvd(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: o.Td$StateListAnimator */
    /* JADX INFO: loaded from: classes14.dex */
    public class StateListAnimator implements View.OnClickListener {
        public int AEQbTJ;
        public java.lang.Object AhwBna;
        public boolean KWHzl;
        public SW OLrzqt;
        public boolean copydefault = true;

        public StateListAnimator(java.lang.Object obj, SW sw, int i) {
            this.AhwBna = obj;
            this.OLrzqt = sw;
            this.AEQbTJ = i;
            this.KWHzl = obj != null && (obj instanceof JSONArray);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            java.lang.Object objOpt;
            java.lang.Object tag = view.getTag();
            if (tag != null && (tag instanceof java.lang.Boolean)) {
                this.copydefault = ((java.lang.Boolean) tag).booleanValue();
                view.setTag(null);
            }
            if (this.OLrzqt.getChildCount() == 1) {
                JSONArray jSONArrayNames = this.KWHzl ? (JSONArray) this.AhwBna : ((JSONObject) this.AhwBna).names();
                if (jSONArrayNames != null) {
                    this.copydefault = false;
                    if (!this.KWHzl && jSONArrayNames.length() == 1 && "nameValuePairs".equals(jSONArrayNames.opt(0).toString()) && (objOpt = ((JSONObject) this.AhwBna).opt("nameValuePairs")) != null) {
                        this.AhwBna = objOpt;
                        boolean z = objOpt instanceof JSONArray;
                        this.KWHzl = z;
                        jSONArrayNames = z ? (JSONArray) objOpt : ((JSONObject) objOpt).names();
                    }
                    for (int i = 0; jSONArrayNames != null && i < jSONArrayNames.length(); i++) {
                        SW sw = new SW(this.OLrzqt.getContext());
                        java.lang.Object objOpt2 = jSONArrayNames.opt(i);
                        if (this.KWHzl) {
                            C5474Td.this.KWHzl(java.lang.String.valueOf(i), objOpt2, sw, this.AEQbTJ);
                        } else {
                            java.lang.String str = (java.lang.String) objOpt2;
                            C5474Td.this.KWHzl(str, ((JSONObject) this.AhwBna).opt(str), sw, this.AEQbTJ);
                        }
                        this.OLrzqt.EZpvd(sw);
                    }
                } else {
                    this.copydefault = !this.copydefault;
                }
                this.OLrzqt.copydefault(this.copydefault);
                this.OLrzqt.requestLayout();
                this.OLrzqt.invalidate();
                return;
            }
            boolean z2 = !this.copydefault;
            this.copydefault = z2;
            this.OLrzqt.copydefault(z2);
            for (int i2 = 1; i2 < this.OLrzqt.getChildCount(); i2++) {
                this.OLrzqt.getChildAt(i2).setVisibility(!this.copydefault ? 0 : 8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f A[PHI: r0
  0x000f: PHI (r0v1 int) = (r0v0 int), (r0v4 int) binds: [B:3:0x0005, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTextSize(float f) {
        int i = this.AkhnZx;
        if (f < i) {
            f = i;
        } else {
            i = this.valueOf;
            if (f > i) {
            }
        }
        if (OLrzqt != f) {
            OLrzqt = f;
            OLrzqt(f);
        }
    }

    public void OLrzqt(float f) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            OLrzqt(this.fetchVPNInfo.getChildAt(i), f);
        }
    }

    public final void OLrzqt(android.view.View view, float f) {
        if (view instanceof SW) {
            SW sw = (SW) view;
            sw.setTextSize(f);
            int childCount = sw.getChildCount();
            for (int i = 0; i < childCount; i++) {
                OLrzqt(sw.getChildAt(i), f);
            }
        }
    }

    public final void copydefault(float f) {
        setTextSize(OLrzqt * ((f / 100.0f) + 1.0f));
    }

    public final float EZpvd(android.view.MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) java.lang.Math.sqrt((x * x) + (y * y));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction() & motionEvent.getActionMasked();
        boolean z = false;
        if (action == 0) {
            this.fARcdN = 1;
        } else if (action == 1) {
            this.fARcdN = 0;
        } else if (action != 2) {
            if (action == 5) {
                this.AuCTel = EZpvd(motionEvent);
                this.fARcdN++;
            } else if (action == 6) {
                this.fARcdN--;
                z = true;
            }
        } else if (this.fARcdN >= 2) {
            float fEZpvd = EZpvd(motionEvent);
            if (java.lang.Math.abs(fEZpvd - this.AuCTel) > 3.0f) {
                copydefault(fEZpvd - this.AuCTel);
                this.AuCTel = fEZpvd;
            }
        }
        return z ? z : super.dispatchTouchEvent(motionEvent);
    }

    public final java.lang.String KWHzl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("      ");
        }
        return sb.toString();
    }

    public void copydefault() {
        android.widget.LinearLayout linearLayout = this.fetchVPNInfo;
        if (linearLayout != null) {
            copydefault(linearLayout, false);
        }
    }

    public final void copydefault(android.view.ViewGroup viewGroup, boolean z) {
        boolean z2 = viewGroup instanceof SW;
        if (z2) {
            EZpvd((SW) viewGroup, z);
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (z2) {
                EZpvd((SW) viewGroup, z);
            }
            if (childAt instanceof android.view.ViewGroup) {
                copydefault((android.view.ViewGroup) childAt, z);
            }
        }
    }

    public final void EZpvd(SW sw, boolean z) {
        if (sw != null) {
            if (z) {
                sw.EZpvd();
            } else {
                sw.copydefault();
            }
        }
    }
}
