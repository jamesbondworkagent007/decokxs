package o;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.core.view.ViewCompat;
import com.okinc.uilab.shape.helper.ShapeGradientAngle;
import com.okinc.uilab.shape.helper.ShapeGradientType;
import com.okinc.uilab.shape.helper.ShapeType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55280xgv {
    public float AEQbTJ;
    public int AYXKKw;
    public int AkhnZx;
    public float AubY;
    public float EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public float copydefault;
    public int fIwbmz;
    public int fJNWhG;
    public boolean fetchVPNInfo;
    public float gEmmrt;
    public android.content.res.ColorStateList getFieldNames;
    public int isConnected;
    public float uzCIH;
    public float valueOf;
    public boolean zsXlph;
    public ShapeType AuCTel = ShapeType.RECTANGLE;
    public int iwGUEr = -1;
    public int wlaJM = -1;
    public int getNewProxyInstance = -1;
    public ShapeGradientAngle ejfBZ = ShapeGradientAngle.LEFT_RIGHT;
    public int values = -1;
    public int djBIcL = -1;
    public int AhwBna = -1;
    public ShapeGradientType DbNXlk = ShapeGradientType.LINEAR;
    public int hDKMBd = -1;
    public int fARcdN = -1;

    /* JADX INFO: renamed from: o.xgv$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ShapeType.values().length];
            try {
                iArr[ShapeType.RECTANGLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeType.OVAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ShapeType.LINE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ShapeType.RING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[ShapeGradientType.values().length];
            try {
                iArr2[ShapeGradientType.LINEAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[ShapeGradientType.RADIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[ShapeGradientType.SWEEP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            EZpvd = iArr2;
            int[] iArr3 = new int[ShapeGradientAngle.values().length];
            try {
                iArr3[ShapeGradientAngle.LEFT_RIGHT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[ShapeGradientAngle.BL_TR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[ShapeGradientAngle.BOTTOM_TOP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[ShapeGradientAngle.BR_TL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[ShapeGradientAngle.RIGHT_LEFT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[ShapeGradientAngle.TR_BL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[ShapeGradientAngle.TOP_BOTTOM.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[ShapeGradientAngle.TL_BR.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            KWHzl = iArr3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv AEQbTJ(float f) {
        this.KWHzl = f;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv AEQbTJ(int i) {
        this.djBIcL = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv AEQbTJ(boolean z) {
        this.fetchVPNInfo = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv AYXKKw(float f) {
        this.uzCIH = f;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv AYXKKw(int i) {
        this.isConnected = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv AhwBna(float f) {
        this.gEmmrt = f;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv AhwBna(int i) {
        this.AkhnZx = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv DbNXlk(int i) {
        this.getNewProxyInstance = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv EZpvd(float f) {
        this.OLrzqt = f;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv EZpvd(android.content.res.ColorStateList colorStateList) {
        this.getFieldNames = colorStateList;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv KWHzl(float f) {
        this.AEQbTJ = f;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv KWHzl(int i) {
        this.AhwBna = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv OLrzqt(float f) {
        this.EZpvd = f;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv OLrzqt(int i) {
        this.values = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv OLrzqt(@NotNull ShapeGradientAngle shapeGradientAngle) {
        Intrinsics.checkNotNullParameter(shapeGradientAngle, "");
        this.ejfBZ = shapeGradientAngle;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv OLrzqt(@NotNull ShapeGradientType shapeGradientType) {
        Intrinsics.checkNotNullParameter(shapeGradientType, "");
        this.DbNXlk = shapeGradientType;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv copydefault(float f) {
        this.copydefault = f;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv copydefault(int i) {
        this.AYXKKw = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv copydefault(@NotNull ShapeType shapeType) {
        Intrinsics.checkNotNullParameter(shapeType, "");
        this.AuCTel = shapeType;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv copydefault(boolean z) {
        this.zsXlph = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv djBIcL(int i) {
        this.fARcdN = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv fetchVPNInfo(int i) {
        this.wlaJM = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv gEmmrt(float f) {
        this.AubY = f;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv gEmmrt(int i) {
        this.fJNWhG = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv isConnected(int i) {
        this.hDKMBd = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv valueOf(float f) {
        this.valueOf = f;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv valueOf(int i) {
        this.fIwbmz = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55280xgv values(int i) {
        this.iwGUEr = i;
        return this;
    }

    public final void KWHzl(@NotNull android.view.View view, @NotNull C55279xgu c55279xgu) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c55279xgu, "");
        copydefault(ShapeType.Companion.OLrzqt(c55279xgu.getNewProxyInstance()));
        EZpvd(c55279xgu.OLrzqt());
        KWHzl(c55279xgu.EZpvd());
        AEQbTJ(c55279xgu.AEQbTJ());
        copydefault(c55279xgu.copydefault());
        OLrzqt(c55279xgu.KWHzl());
        values(c55279xgu.hDKMBd());
        DbNXlk(c55279xgu.getFieldNames());
        EZpvd(c55279xgu.zsXlph());
        fetchVPNInfo(c55279xgu.AubY());
        gEmmrt(c55279xgu.zLjUOn());
        AYXKKw(c55279xgu.wlaJM());
        copydefault(c55279xgu.AuCTelauCTel());
        AYXKKw(c55279xgu.AuCTel());
        gEmmrt(c55279xgu.ejfBZ());
        valueOf(c55279xgu.fARcdN());
        AhwBna(c55279xgu.fetchVPNInfo());
        isConnected(c55279xgu.iwGUEr());
        djBIcL(c55279xgu.uzCIH());
        OLrzqt(ShapeGradientType.Companion.AEQbTJ(c55279xgu.DbNXlk()));
        OLrzqt(ShapeGradientAngle.Companion.KWHzl(c55279xgu.gEmmrt()));
        copydefault(c55279xgu.AkhnZx());
        AEQbTJ(c55279xgu.isConnected());
        valueOf(c55279xgu.djBIcL());
        AhwBna(c55279xgu.AhwBna());
        OLrzqt(c55279xgu.values());
        AEQbTJ(c55279xgu.AYXKKw());
        KWHzl(c55279xgu.valueOf());
        OLrzqt(view);
    }

    public final void copydefault(GradientDrawable gradientDrawable) {
        int i = TaskDescription.OLrzqt[this.AuCTel.ordinal()];
        if (i == 1) {
            gradientDrawable.setShape(0);
            return;
        }
        if (i == 2) {
            gradientDrawable.setShape(1);
        } else if (i == 3) {
            gradientDrawable.setShape(2);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            gradientDrawable.setShape(3);
        }
    }

    public final void EZpvd(GradientDrawable gradientDrawable) {
        int i = this.hDKMBd;
        if (i > 0 || this.fARcdN > 0) {
            gradientDrawable.setSize(i, this.fARcdN);
        }
    }

    public final void AEQbTJ(GradientDrawable gradientDrawable) {
        int i = this.wlaJM;
        if (i >= 0) {
            android.content.res.ColorStateList colorStateList = this.getFieldNames;
            if (colorStateList != null) {
                gradientDrawable.setStroke(i, colorStateList, this.AubY, this.uzCIH);
            } else {
                gradientDrawable.setStroke(i, this.getNewProxyInstance, this.AubY, this.uzCIH);
            }
        }
    }

    public final void OLrzqt(GradientDrawable gradientDrawable) {
        if (this.AuCTel == ShapeType.RECTANGLE) {
            float f = this.OLrzqt;
            if (f != 0.0f) {
                gradientDrawable.setCornerRadius(f);
                return;
            }
            float f2 = this.AEQbTJ;
            if (f2 == 0.0f && this.KWHzl == 0.0f && this.copydefault == 0.0f && this.EZpvd == 0.0f) {
                return;
            }
            float f3 = this.KWHzl;
            float f4 = this.copydefault;
            float f5 = this.EZpvd;
            gradientDrawable.setCornerRadii(new float[]{f2, f2, f3, f3, f4, f4, f5, f5});
        }
    }

    public final void AYXKKw(GradientDrawable gradientDrawable) {
        if (this.values == -1 && this.AhwBna == -1) {
            gradientDrawable.setColor(this.iwGUEr);
        }
    }

    public final void AEQbTJ(GradientDrawable gradientDrawable, int i) {
        if (!this.zsXlph || i == 0) {
            return;
        }
        switch (i) {
            case -16842910:
                gradientDrawable.setColor(this.AkhnZx);
                break;
            case android.R.attr.state_enabled:
                gradientDrawable.setColor(this.isConnected);
                break;
            case android.R.attr.state_selected:
                int i2 = this.fJNWhG;
                if (i2 == 0) {
                    i2 = this.isConnected;
                }
                gradientDrawable.setColor(i2);
                break;
            case android.R.attr.state_pressed:
                gradientDrawable.setColor(this.fIwbmz);
                break;
        }
    }

    public final void KWHzl(GradientDrawable gradientDrawable) {
        int i = this.values;
        if (i == -1 && this.AhwBna == -1) {
            return;
        }
        int i2 = this.djBIcL;
        if (i2 == -1) {
            gradientDrawable.setColors(new int[]{i, this.AhwBna});
        } else {
            gradientDrawable.setColors(new int[]{i, i2, this.AhwBna});
        }
        int i3 = TaskDescription.EZpvd[this.DbNXlk.ordinal()];
        if (i3 == 1) {
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(AEQbTJ(this.ejfBZ));
        } else if (i3 == 2) {
            gradientDrawable.setGradientType(1);
            gradientDrawable.setGradientRadius(this.AYXKKw);
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            gradientDrawable.setGradientType(2);
        }
        float f = this.valueOf;
        if (f != 0.0f || this.gEmmrt != 0.0f) {
            gradientDrawable.setGradientCenter(f, this.gEmmrt);
        }
        gradientDrawable.setUseLevel(this.fetchVPNInfo);
    }

    public final GradientDrawable.Orientation AEQbTJ(ShapeGradientAngle shapeGradientAngle) {
        switch (TaskDescription.KWHzl[shapeGradientAngle.ordinal()]) {
            case 1:
                return GradientDrawable.Orientation.LEFT_RIGHT;
            case 2:
                return GradientDrawable.Orientation.BL_TR;
            case 3:
                return GradientDrawable.Orientation.BOTTOM_TOP;
            case 4:
                return GradientDrawable.Orientation.BR_TL;
            case 5:
                return GradientDrawable.Orientation.RIGHT_LEFT;
            case 6:
                return GradientDrawable.Orientation.TR_BL;
            case 7:
                return GradientDrawable.Orientation.TOP_BOTTOM;
            case 8:
                return GradientDrawable.Orientation.TL_BR;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final StateListDrawable AEQbTJ() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, EZpvd(android.R.attr.state_pressed));
        stateListDrawable.addState(new int[]{-16842910}, EZpvd(-16842910));
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, EZpvd(android.R.attr.state_selected));
        stateListDrawable.addState(new int[0], EZpvd(android.R.attr.state_enabled));
        return stateListDrawable;
    }

    public final GradientDrawable EZpvd(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        copydefault(gradientDrawable);
        KWHzl(gradientDrawable);
        AYXKKw(gradientDrawable);
        AEQbTJ(gradientDrawable);
        OLrzqt(gradientDrawable);
        EZpvd(gradientDrawable);
        AEQbTJ(gradientDrawable, i);
        return gradientDrawable;
    }

    public final void OLrzqt(android.view.View view) {
        if (view == null) {
            return;
        }
        ViewCompat.setBackground(view, this.zsXlph ? AEQbTJ() : EZpvd(0));
    }
}
