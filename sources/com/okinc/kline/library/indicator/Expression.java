package com.okinc.kline.library.indicator;

import androidx.camera.video.AudioStats;
import java.util.ArrayList;
import o.C36246oUr;
import o.oLO;
import o.pDT;
import o.pFN;

/* JADX INFO: loaded from: classes8.dex */
public class Expression {

    public static abstract class ComponentCallbacks2 {
        public static ComponentCallbacks2 KWHzl;
        public int EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void EZpvd(ComponentCallbacks2 componentCallbacks2) {
            KWHzl = componentCallbacks2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static ComponentCallbacks2 copydefault() {
            return KWHzl;
        }

        public abstract double AEQbTJ(int i);

        public abstract double AEQbTJ(int i, String str);

        public abstract int AEQbTJ();

        public abstract double AYXKKw(int i);

        public abstract double AhwBna(int i);

        public abstract double AkhnZx(int i);

        public abstract double DbNXlk(int i);

        public abstract double EZpvd(int i);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int EZpvd() {
            return this.EZpvd;
        }

        public abstract double KWHzl(int i);

        public abstract double OLrzqt(int i);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt() {
            this.EZpvd = -1;
        }

        public abstract double copydefault(int i);

        public abstract double djBIcL(int i);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void fJNWhG(int i) {
            this.EZpvd = i;
        }

        public abstract double fetchVPNInfo(int i);

        public abstract double gEmmrt(int i);

        public abstract double isConnected(int i);

        public abstract double valueOf(int i);

        public abstract double values(int i);

        public ComponentCallbacks2() {
            OLrzqt();
        }
    }

    public static abstract class ComponentName {
        public void clear() {
        }

        public abstract double execute(int i);

        public int getColor(int i) {
            return 0;
        }

        private ComponentName() {
        }
    }

    public static class Bitmap extends ComponentName {
        public Bitmap() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().values(i);
        }
    }

    public static class Context extends ComponentName {
        public Context() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().AhwBna(i);
        }
    }

    public static class ApplicationInfo extends ComponentName {
        public ApplicationInfo() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().AYXKKw(i);
        }
    }

    public static class Dialog extends ComponentName {
        public Dialog() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().KWHzl(i);
        }
    }

    public static class Parcelable extends ComponentName {
        public Parcelable() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().AkhnZx(i);
        }
    }

    public static class LoaderManager extends ComponentName {
        public String EZpvd;

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        public LoaderManager(String str) {
            super();
            this.EZpvd = str;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().AEQbTJ(i, this.EZpvd);
        }
    }

    public static class Resources extends ComponentName {
        public Resources() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().djBIcL(i);
        }
    }

    public static class VoiceInteractor extends ComponentName {
        public VoiceInteractor() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            if (ComponentCallbacks2.copydefault().AEQbTJ(i) != AudioStats.AUDIO_AMPLITUDE_NONE) {
                ComponentCallbacks2.copydefault().AEQbTJ(i);
            }
            return ComponentCallbacks2.copydefault().AEQbTJ(i);
        }
    }

    public static class SharedElementCallback extends ComponentName {
        public SharedElementCallback() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().EZpvd(i);
        }
    }

    public static class PictureInPictureParams extends ComponentName {
        public PictureInPictureParams() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().copydefault(i);
        }
    }

    public static class AssistContent extends ComponentName {
        public AssistContent() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().OLrzqt(i);
        }
    }

    public static class IntentFilter extends ComponentName {
        public IntentFilter() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            if (ComponentCallbacks2.copydefault().valueOf(i) != AudioStats.AUDIO_AMPLITUDE_NONE) {
                ComponentCallbacks2.copydefault().valueOf(i);
            }
            return ComponentCallbacks2.copydefault().valueOf(i);
        }
    }

    public static class IntentSender extends ComponentName {
        public IntentSender() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().gEmmrt(i);
        }
    }

    public static class Bundle extends ComponentName {
        public Bundle() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().isConnected(i);
        }
    }

    public static class BaseBundle extends ComponentName {
        public BaseBundle() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().DbNXlk(i);
        }
    }

    public static class IBinder extends ComponentName {
        public IBinder() {
            super();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return ComponentCallbacks2.copydefault().fetchVPNInfo(i);
        }
    }

    public static class FragmentManager extends ComponentName {
        public double copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return this.copydefault;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        public FragmentManager(double d) {
            super();
            this.copydefault = d;
        }
    }

    public static class Parameter extends ComponentName {
        protected boolean mCanChangeTransparency;
        protected String mColor;
        protected String mColorBlk;
        protected String mColorBlkDefaultValue;
        protected String mColorBlkTemp;
        protected String mColorDefaultValue;
        protected String mColorTemp;
        protected double mDefaultValue;
        protected boolean mIsShow;
        protected boolean mIsShowDefaultValue;
        protected boolean mIsShowTemp;
        protected double mLineWidth;
        public double mMaxValue;
        protected double mMinValue;
        private String mName;
        protected double mTempValue;
        protected int mTransparency;
        protected int mTransparencyDefaultValue;
        protected int mTransparencyTemp;
        public double mValue;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return this.mValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean getCanChangeTransparency() {
            return this.mCanChangeTransparency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getColor() {
            return this.mColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getColorBlk() {
            return this.mColorBlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getColorBlkDefaultValue() {
            return this.mColorBlkDefaultValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getColorBlkTemp() {
            return this.mColorBlkTemp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getColorDefaultValue() {
            return this.mColorDefaultValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getColorTemp() {
            return this.mColorTemp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double getDefaultValue() {
            return this.mDefaultValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean getIsShow() {
            return this.mIsShow;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean getIsShowDefaultValue() {
            return this.mIsShowDefaultValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean getIsShowTemp() {
            return this.mIsShowTemp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double getLineWidth() {
            return this.mLineWidth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double getMaxValue() {
            return this.mMaxValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double getMinValue() {
            return this.mMinValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getName() {
            return this.mName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double getTempValue() {
            return this.mTempValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getTransparency() {
            return this.mTransparency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getTransparencyDefaultValue() {
            return this.mTransparencyDefaultValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getTransparencyTemp() {
            return this.mTransparencyTemp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double getValue() {
            return this.mValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setColor(String str) {
            this.mColor = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setColorBlk(String str) {
            this.mColorBlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setColorBlkDefaultValue(String str) {
            this.mColorBlkDefaultValue = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setColorBlkTemp(String str) {
            this.mColorBlkTemp = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setColorDefaultValue(String str) {
            this.mColorDefaultValue = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setColorTemp(String str) {
            this.mColorTemp = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setIsShow(boolean z) {
            this.mIsShow = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setIsShowTemp(boolean z) {
            this.mIsShowTemp = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setLineWidth(double d) {
            this.mLineWidth = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setName(String str) {
            this.mName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setSubValue(boolean z, String str, int i) {
            this.mIsShow = z;
            this.mColor = str;
            this.mTransparency = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setSubValue(boolean z, String str, int i, String str2) {
            this.mIsShow = z;
            this.mColor = str;
            this.mTransparency = i;
            this.mColorBlk = str2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setTempValue(double d) {
            this.mTempValue = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setTransparencyTemp(int i) {
            this.mTransparencyTemp = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setValue(double d) {
            double d2 = AudioStats.AUDIO_AMPLITUDE_NONE;
            if (d != AudioStats.AUDIO_AMPLITUDE_NONE) {
                d2 = this.mMinValue;
                if (d >= d2) {
                    d2 = this.mMaxValue;
                    if (d <= d2) {
                        this.mValue = d;
                        return;
                    }
                }
            }
            this.mValue = d2;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        public Parameter(String str, double d, double d2, double d3) {
            super();
            this.mIsShow = true;
            this.mIsShowTemp = true;
            this.mIsShowDefaultValue = true;
            this.mCanChangeTransparency = false;
            this.mTransparency = 100;
            this.mTransparencyTemp = 100;
            this.mTransparencyDefaultValue = 100;
            pDT.StateListAnimator stateListAnimator = pDT.Companion;
            String strAhwBna = stateListAnimator.KWHzl().AhwBna();
            this.mColor = strAhwBna;
            this.mColorTemp = strAhwBna;
            this.mColorDefaultValue = strAhwBna;
            this.mLineWidth = 1.0d;
            String strValueOf = stateListAnimator.KWHzl().valueOf();
            this.mColorBlk = strValueOf;
            this.mColorBlkTemp = strValueOf;
            this.mColorBlkDefaultValue = strValueOf;
            this.mName = str;
            this.mMinValue = d;
            this.mMaxValue = d2;
            this.mDefaultValue = d3;
            this.mValue = d3;
        }

        public Parameter(String str, boolean z, String str2, int i, boolean z2) {
            super();
            this.mIsShow = true;
            this.mIsShowTemp = true;
            this.mIsShowDefaultValue = true;
            this.mCanChangeTransparency = false;
            this.mTransparency = 100;
            this.mTransparencyTemp = 100;
            this.mTransparencyDefaultValue = 100;
            pDT.StateListAnimator stateListAnimator = pDT.Companion;
            String strAhwBna = stateListAnimator.KWHzl().AhwBna();
            this.mColor = strAhwBna;
            this.mColorTemp = strAhwBna;
            this.mColorDefaultValue = strAhwBna;
            this.mLineWidth = 1.0d;
            String strValueOf = stateListAnimator.KWHzl().valueOf();
            this.mColorBlk = strValueOf;
            this.mColorBlkTemp = strValueOf;
            this.mColorBlkDefaultValue = strValueOf;
            this.mName = str;
            this.mIsShowTemp = z;
            this.mIsShowDefaultValue = z;
            this.mIsShow = z;
            this.mColorTemp = str2;
            this.mColorDefaultValue = str2;
            this.mColor = str2;
            this.mTransparencyTemp = i;
            this.mTransparencyDefaultValue = i;
            this.mTransparency = i;
            this.mCanChangeTransparency = z2;
        }

        public Parameter(String str, boolean z, oLO olo, int i, boolean z2) {
            String strOLrzqt;
            super();
            this.mIsShow = true;
            this.mIsShowTemp = true;
            this.mIsShowDefaultValue = true;
            this.mCanChangeTransparency = false;
            this.mTransparency = 100;
            this.mTransparencyTemp = 100;
            this.mTransparencyDefaultValue = 100;
            pDT.StateListAnimator stateListAnimator = pDT.Companion;
            String strAhwBna = stateListAnimator.KWHzl().AhwBna();
            this.mColor = strAhwBna;
            this.mColorTemp = strAhwBna;
            this.mColorDefaultValue = strAhwBna;
            this.mLineWidth = 1.0d;
            String strValueOf = stateListAnimator.KWHzl().valueOf();
            this.mColorBlk = strValueOf;
            this.mColorBlkTemp = strValueOf;
            this.mColorBlkDefaultValue = strValueOf;
            this.mName = str;
            this.mIsShowTemp = z;
            this.mIsShowDefaultValue = z;
            this.mIsShow = z;
            if (pFN.OLrzqt.KWHzl() == "kline_dark") {
                strOLrzqt = olo.EZpvd();
            } else {
                strOLrzqt = olo.OLrzqt();
            }
            this.mColorTemp = strOLrzqt;
            this.mColorDefaultValue = strOLrzqt;
            this.mColor = strOLrzqt;
            String strCopydefault = olo.copydefault();
            this.mColorBlkTemp = strCopydefault;
            this.mColorBlkDefaultValue = strCopydefault;
            this.mColorBlk = strCopydefault;
            this.mTransparencyTemp = i;
            this.mTransparencyDefaultValue = i;
            this.mTransparency = i;
            this.mCanChangeTransparency = z2;
        }
    }

    public static abstract class SQLiteDatabase extends ComponentName {
        public final ComponentName copydefault;

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        public SQLiteDatabase(ComponentName componentName) {
            super();
            this.copydefault = componentName;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public void clear() {
            this.copydefault.clear();
        }
    }

    public static abstract class CursorFactory extends ComponentName {
        public final ComponentName EZpvd;
        public final ComponentName OLrzqt;

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        public CursorFactory(ComponentName componentName, ComponentName componentName2) {
            super();
            this.OLrzqt = componentName;
            this.EZpvd = componentName2;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public void clear() {
            this.OLrzqt.clear();
            this.EZpvd.clear();
        }
    }

    public static abstract class Canvas extends ComponentName {
        public final ComponentName AEQbTJ;
        public final ComponentName KWHzl;
        public final ComponentName OLrzqt;

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        public Canvas(ComponentName componentName, ComponentName componentName2, ComponentName componentName3) {
            super();
            this.KWHzl = componentName;
            this.OLrzqt = componentName2;
            this.AEQbTJ = componentName3;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public void clear() {
            this.KWHzl.clear();
            this.OLrzqt.clear();
            this.AEQbTJ.clear();
        }
    }

    public static abstract class SQLiteClosable extends ComponentName {
        public final ComponentName AYXKKw;
        public final ComponentName KWHzl;
        public final ComponentName gEmmrt;
        public final ComponentName valueOf;

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        public SQLiteClosable(ComponentName componentName, ComponentName componentName2, ComponentName componentName3, ComponentName componentName4) {
            super();
            this.KWHzl = componentName;
            this.gEmmrt = componentName2;
            this.valueOf = componentName3;
            this.AYXKKw = componentName4;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public void clear() {
            this.KWHzl.clear();
            this.gEmmrt.clear();
            this.valueOf.clear();
            this.AYXKKw.clear();
        }
    }

    public static class Cursor extends SQLiteDatabase {
        public Cursor(ComponentName componentName) {
            super(componentName);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return -this.copydefault.execute(i);
        }
    }

    public static class Application extends CursorFactory {
        public Application(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return this.OLrzqt.execute(i) + this.EZpvd.execute(i);
        }
    }

    public static class Callback extends CursorFactory {
        public Callback(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return this.OLrzqt.execute(i) - this.EZpvd.execute(i);
        }
    }

    public static class AssetManager extends CursorFactory {
        public AssetManager(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return this.OLrzqt.execute(i) * this.EZpvd.execute(i);
        }
    }

    public static class TaskStackBuilder extends CursorFactory {
        public TaskStackBuilder(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            double dExecute = this.OLrzqt.execute(i);
            double dExecute2 = this.EZpvd.execute(i);
            return dExecute == AudioStats.AUDIO_AMPLITUDE_NONE ? AudioStats.AUDIO_AMPLITUDE_NONE : dExecute2 == AudioStats.AUDIO_AMPLITUDE_NONE ? dExecute > AudioStats.AUDIO_AMPLITUDE_NONE ? 1000000.0d : -1000000.0d : dExecute / dExecute2;
        }
    }

    public static class ContentResolver extends CursorFactory {
        public ContentResolver(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            if (this.OLrzqt.execute(i) > this.EZpvd.execute(i)) {
                return 1.0d;
            }
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
    }

    public static class PackageItemInfo extends CursorFactory {
        public PackageItemInfo(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            if (this.OLrzqt.execute(i) < this.EZpvd.execute(i)) {
                return 1.0d;
            }
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
    }

    public static class ClipData extends CursorFactory {
        public ClipData(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            if (this.OLrzqt.execute(i) == this.EZpvd.execute(i)) {
                return 1.0d;
            }
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
    }

    public static class PackageManager extends CursorFactory {
        public PackageManager(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return Math.max(this.OLrzqt.execute(i), this.EZpvd.execute(i));
        }
    }

    public static class Configuration extends CursorFactory {
        public Configuration(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return Math.min(this.OLrzqt.execute(i), this.EZpvd.execute(i));
        }
    }

    public static class TaskDescription extends SQLiteDatabase {
        public TaskDescription(ComponentName componentName) {
            super(componentName);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return Math.abs(this.copydefault.execute(i));
        }
    }

    public static class Intent extends SQLiteDatabase {
        public double EZpvd;

        public Intent(ComponentName componentName) {
            super(componentName);
            this.EZpvd = AudioStats.AUDIO_AMPLITUDE_NONE;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            double dExecute = this.copydefault.execute(i);
            if (Double.isNaN(dExecute) || Double.isInfinite(dExecute)) {
                return this.EZpvd;
            }
            this.EZpvd = dExecute;
            return dExecute;
        }

        @Override // com.okinc.kline.library.indicator.Expression.SQLiteDatabase, com.okinc.kline.library.indicator.Expression.ComponentName
        public void clear() {
            this.EZpvd = AudioStats.AUDIO_AMPLITUDE_NONE;
            super.clear();
        }
    }

    public static class Rect extends CursorFactory {
        public String AEQbTJ;
        public int copydefault;

        public Rect(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
            this.copydefault = -1;
        }

        public Rect(ComponentName componentName, ComponentName componentName2, String str) {
            super(componentName, componentName2);
            this.copydefault = -1;
            this.AEQbTJ = str;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            if (this.copydefault < 0) {
                int iExecute = (int) this.EZpvd.execute(i);
                this.copydefault = iExecute;
                if (iExecute < 0) {
                    throw new IllegalArgumentException();
                }
            }
            int i2 = i - this.copydefault;
            if (i2 < ComponentCallbacks2.copydefault().AEQbTJ()) {
                String str = this.AEQbTJ;
                if (str != null && str.equals("SUPERTREND")) {
                    return this.OLrzqt.execute(0);
                }
                throw new IllegalArgumentException();
            }
            return this.OLrzqt.execute(i2);
        }
    }

    public static class Mode extends CursorFactory {
        public int AEQbTJ;

        public Mode(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
            this.AEQbTJ = -1;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            int i2;
            if (this.AEQbTJ < 0) {
                double dExecute = this.EZpvd.execute(i);
                if (!Double.isFinite(dExecute) || (i2 = (int) dExecute) < 0) {
                    return Double.NaN;
                }
                this.AEQbTJ = i2;
            }
            int i3 = i - this.AEQbTJ;
            if (i3 < ComponentCallbacks2.copydefault().AEQbTJ()) {
                return Double.NaN;
            }
            try {
                return this.OLrzqt.execute(i3);
            } catch (Exception unused) {
                return Double.NaN;
            }
        }

        @Override // com.okinc.kline.library.indicator.Expression.CursorFactory, com.okinc.kline.library.indicator.Expression.ComponentName
        public void clear() {
            this.AEQbTJ = -1;
            super.clear();
        }
    }

    public static class StateListAnimator extends CursorFactory {
        public StateListAnimator(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            if (this.OLrzqt.execute(i) == AudioStats.AUDIO_AMPLITUDE_NONE || this.EZpvd.execute(i) == AudioStats.AUDIO_AMPLITUDE_NONE) {
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            return 1.0d;
        }
    }

    public static class SharedPreferences extends Canvas {
        public SharedPreferences(ComponentName componentName, ComponentName componentName2, ComponentName componentName3) {
            super(componentName, componentName2, componentName3);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return (this.KWHzl.execute(i) != AudioStats.AUDIO_AMPLITUDE_NONE ? this.OLrzqt : this.AEQbTJ).execute(i);
        }
    }

    public static class ActionBar extends SQLiteDatabase {
        public ArrayList<Application> AEQbTJ;
        public final String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String EZpvd() {
            return this.EZpvd;
        }

        public static class Application {
            public int EZpvd;
            public double copydefault;

            private Application() {
            }
        }

        public int OLrzqt() {
            return this.AEQbTJ.size();
        }

        public ActionBar(String str, ComponentName componentName) {
            super(componentName);
            this.AEQbTJ = new ArrayList<>();
            this.EZpvd = str;
        }

        public void AEQbTJ(int i, boolean z) {
            while (i >= this.AEQbTJ.size()) {
                this.AEQbTJ.add(new Application());
            }
            Application application = this.AEQbTJ.get(r0.size() - 1);
            application.copydefault = this.copydefault.execute(i);
            if (z) {
                application = this.AEQbTJ.get(i);
                application.copydefault = this.copydefault.execute(i);
            }
            boolean z2 = this instanceof Output;
            if (z2 && ((Output) this).AYXKKw() == Output.Style.SAR_POINT) {
                application.EZpvd = this.copydefault.getColor(i);
            } else if (z2 && ((Output) this).AYXKKw() == Output.Style.SUPERTREND) {
                application.EZpvd = this.copydefault.getColor(i);
            }
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            return (i < 0 || i >= this.AEQbTJ.size()) ? AudioStats.AUDIO_AMPLITUDE_NONE : this.AEQbTJ.get(i).copydefault;
        }

        @Override // com.okinc.kline.library.indicator.Expression.SQLiteDatabase, com.okinc.kline.library.indicator.Expression.ComponentName
        public int getColor(int i) {
            if (i < 0 || i >= this.AEQbTJ.size()) {
                return 1;
            }
            return this.AEQbTJ.get(i).EZpvd;
        }

        @Override // com.okinc.kline.library.indicator.Expression.SQLiteDatabase, com.okinc.kline.library.indicator.Expression.ComponentName
        public void clear() {
            super.clear();
            this.AEQbTJ.clear();
        }
    }

    public static class Output extends ActionBar {
        public int AYXKKw;
        public double AhwBna;
        public int KWHzl;
        public int OLrzqt;
        public Style djBIcL;
        public int gEmmrt;
        public double valueOf;

        public enum Style {
            NONE,
            LINE,
            LINE_SHADER,
            VOLUME_STICK,
            MACD_STICK,
            SAR_POINT,
            LSA_STICK,
            TAKER_STICK,
            SUPPORT_RESISTANCE,
            SUPERTREND
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void AEQbTJ(double d) {
            this.valueOf = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Style AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt(double d) {
            this.AhwBna = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int copydefault() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double valueOf() {
            return this.AhwBna;
        }

        public Output(String str, ComponentName componentName) {
            super(str, componentName);
            this.djBIcL = Style.LINE;
            this.OLrzqt = -1;
            this.gEmmrt = -1;
            this.KWHzl = -1;
            this.valueOf = Double.MAX_VALUE;
            this.AhwBna = -1.7976931348623157E308d;
        }

        public Output(String str, ComponentName componentName, Style style, int i) {
            super(str, componentName);
            Style style2 = Style.LINE;
            this.gEmmrt = -1;
            this.KWHzl = -1;
            this.valueOf = Double.MAX_VALUE;
            this.AhwBna = -1.7976931348623157E308d;
            this.djBIcL = style;
            this.OLrzqt = i;
        }

        public Output(String str, ComponentName componentName, Style style, int i, int i2) {
            this(str, componentName, style, i);
            this.AYXKKw = i2;
        }

        public Output(String str, ComponentName componentName, Style style, int i, int i2, int i3, int i4) {
            this(str, componentName, style, i, i4);
            this.gEmmrt = i2;
            this.KWHzl = i3;
        }
    }

    public static abstract class Matrix extends CursorFactory {
        public ArrayList<StateListAnimator> KWHzl;
        public int valueOf;

        public static class StateListAnimator {
            public double AEQbTJ;
            public double OLrzqt;
        }

        public abstract double AEQbTJ(int i, double d);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int copydefault() {
            return this.valueOf;
        }

        public void KWHzl() {
            this.valueOf = (int) this.EZpvd.execute(0);
        }

        public Matrix(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
            this.KWHzl = new ArrayList<>();
            this.valueOf = -1;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            if (this.valueOf < 0) {
                KWHzl();
            }
            while (i >= this.KWHzl.size()) {
                this.KWHzl.add(new StateListAnimator());
            }
            StateListAnimator stateListAnimator = this.KWHzl.get(r0.size() - 1);
            double dExecute = this.OLrzqt.execute(i);
            stateListAnimator.AEQbTJ = dExecute;
            double dAEQbTJ = AEQbTJ(i, dExecute);
            stateListAnimator.OLrzqt = dAEQbTJ;
            return dAEQbTJ;
        }

        @Override // com.okinc.kline.library.indicator.Expression.CursorFactory, com.okinc.kline.library.indicator.Expression.ComponentName
        public void clear() {
            super.clear();
            this.valueOf = -1;
            this.KWHzl.clear();
        }
    }

    public static class Paint extends Output {
        public Paint(String str, Matrix matrix) {
            super(str, matrix);
        }

        public Paint(String str, Matrix matrix, Output.Style style, int i) {
            super(str, matrix, style, i);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ActionBar
        public String EZpvd() {
            return super.EZpvd() + String.valueOf(((Matrix) this.copydefault).copydefault());
        }

        public int AhwBna() {
            return ((Matrix) this.copydefault).copydefault();
        }
    }

    public static class DialogInterface extends Matrix {
        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            return d;
        }

        public DialogInterface(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }
    }

    public static class ContextWrapper extends Matrix {
        public ContextWrapper(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            int iCopydefault = copydefault();
            if (iCopydefault == 0) {
                return Double.NaN;
            }
            int iEZpvd = ComponentCallbacks2.copydefault().EZpvd();
            if (iEZpvd < 0) {
                return d;
            }
            if (i > iEZpvd) {
                for (int iMax = Math.max(iEZpvd, (i - iCopydefault) + 1); iMax < i; iMax++) {
                    double d2 = this.KWHzl.get(iMax).AEQbTJ;
                    if (d < d2) {
                        d = d2;
                    }
                }
            }
            return d;
        }
    }

    public static class ServiceConnection extends Matrix {
        public ServiceConnection(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            int iCopydefault = copydefault();
            if (iCopydefault == 0) {
                return Double.NaN;
            }
            int iEZpvd = ComponentCallbacks2.copydefault().EZpvd();
            if (iEZpvd < 0) {
                return d;
            }
            if (i > iEZpvd) {
                for (int iMax = Math.max(iEZpvd, (i - iCopydefault) + 1); iMax < i; iMax++) {
                    double d2 = this.KWHzl.get(iMax).AEQbTJ;
                    if (d > d2) {
                        d = d2;
                    }
                }
            }
            return d;
        }
    }

    public static class Fragment extends Matrix {
        public Fragment(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            int iCopydefault = copydefault();
            if (iCopydefault == 0) {
                return Double.NaN;
            }
            int iEZpvd = ComponentCallbacks2.copydefault().EZpvd();
            if (iEZpvd < 0 || i < iEZpvd) {
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            int i2 = iCopydefault - 1;
            int i3 = i - iEZpvd;
            if (i2 > i3) {
                i2 = i3;
            }
            int i4 = 0;
            while (i2 >= 0) {
                if (this.KWHzl.get(i - i2).AEQbTJ != AudioStats.AUDIO_AMPLITUDE_NONE) {
                    i4++;
                }
                i2--;
            }
            return i4;
        }
    }

    public static class Uri extends Matrix {
        public Uri(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            int iEZpvd = ComponentCallbacks2.copydefault().EZpvd();
            if (iEZpvd < 0) {
                return d;
            }
            if (i <= iEZpvd) {
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            int iCopydefault = copydefault();
            Matrix.StateListAnimator stateListAnimator = this.KWHzl.get(i - 1);
            if (iCopydefault == 0 || iCopydefault >= (i - iEZpvd) + 1) {
                return stateListAnimator.OLrzqt + d;
            }
            return (stateListAnimator.OLrzqt + d) - this.KWHzl.get(i - iCopydefault).AEQbTJ;
        }
    }

    public static class Typeface extends Matrix {
        public ArrayList<TaskDescription> AEQbTJ;

        public Typeface(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
            this.AEQbTJ = new ArrayList<>();
        }

        public static class TaskDescription {
            public double AEQbTJ;

            private TaskDescription() {
            }
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            int iCopydefault = copydefault();
            if (iCopydefault == 0) {
                return Double.NaN;
            }
            while (i >= this.AEQbTJ.size()) {
                this.AEQbTJ.add(new TaskDescription());
            }
            TaskDescription taskDescription = this.AEQbTJ.get(i);
            int iEZpvd = ComponentCallbacks2.copydefault().EZpvd();
            double dPow = AudioStats.AUDIO_AMPLITUDE_NONE;
            if (iEZpvd < 0) {
                taskDescription.AEQbTJ = d;
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            if (i <= iEZpvd) {
                taskDescription.AEQbTJ = d;
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            int i2 = (i - iEZpvd) + 1;
            if (iCopydefault >= i2) {
                double d2 = i2;
                taskDescription.AEQbTJ = (this.AEQbTJ.get(i - 1).AEQbTJ * (1.0d - (1.0d / d2))) + (d / d2);
                iCopydefault = i2;
            } else {
                taskDescription.AEQbTJ = this.AEQbTJ.get(i - 1).AEQbTJ + ((d - this.KWHzl.get(i - iCopydefault).AEQbTJ) / ((double) iCopydefault));
            }
            int i3 = i - iCopydefault;
            while (true) {
                i3++;
                if (i3 <= i) {
                    dPow += Math.pow(this.KWHzl.get(i3).AEQbTJ - taskDescription.AEQbTJ, 2.0d);
                } else {
                    return Math.sqrt(dPow / ((double) iCopydefault));
                }
            }
        }
    }

    public static class Activity extends Matrix {
        public double copydefault;

        public Activity(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            int iCopydefault = copydefault();
            if (iCopydefault == 0) {
                return Double.NaN;
            }
            if (ComponentCallbacks2.copydefault().EZpvd() < 0 || i == 0) {
                double dAhwBna = ComponentCallbacks2.copydefault().AhwBna(0) - ComponentCallbacks2.copydefault().AYXKKw(0);
                this.copydefault = dAhwBna;
                return dAhwBna;
            }
            if (i >= iCopydefault) {
                return ((this.KWHzl.get(i - 1).OLrzqt * ((double) (iCopydefault - 1))) + d) / ((double) iCopydefault);
            }
            double d2 = this.copydefault + d;
            this.copydefault = d2;
            return d2 / ((double) (i + 1));
        }
    }

    public static class ColorStateList extends Matrix {
        public ColorStateList(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            int iCopydefault = copydefault();
            if (iCopydefault == 0) {
                return Double.NaN;
            }
            int iEZpvd = ComponentCallbacks2.copydefault().EZpvd();
            if (iEZpvd < 0 || i <= iEZpvd) {
                return d;
            }
            int i2 = (i - iEZpvd) + 1;
            if (iCopydefault >= i2) {
                double d2 = i2;
                return (this.KWHzl.get(i - 1).OLrzqt * (1.0d - (1.0d / d2))) + (d / d2);
            }
            return this.KWHzl.get(i - 1).OLrzqt + ((d - this.KWHzl.get(i - iCopydefault).AEQbTJ) / ((double) iCopydefault));
        }
    }

    public static class ComponentCallbacks extends Matrix {
        public double AEQbTJ;

        public ComponentCallbacks(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public void KWHzl() {
            super.KWHzl();
            this.AEQbTJ = 2.0d / ((double) (copydefault() + 1));
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            if (copydefault() == 0) {
                return Double.NaN;
            }
            int iEZpvd = ComponentCallbacks2.copydefault().EZpvd();
            if (iEZpvd < 0 || i <= iEZpvd) {
                return d;
            }
            Matrix.StateListAnimator stateListAnimator = this.KWHzl.get(i - 1);
            double d2 = this.AEQbTJ;
            double d3 = stateListAnimator.OLrzqt;
            return (d2 * (d - d3)) + d3;
        }
    }

    public static class BroadcastReceiver extends ComponentCallbacks {
        public BroadcastReceiver(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks, com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            int iEZpvd = ComponentCallbacks2.copydefault().EZpvd();
            if (iEZpvd < 0 || i <= iEZpvd) {
                return d;
            }
            int iCopydefault = copydefault();
            Matrix.StateListAnimator stateListAnimator = this.KWHzl.get(i - 1);
            int i2 = (i - iEZpvd) + 1;
            if (iCopydefault >= i2) {
                double d2 = stateListAnimator.OLrzqt;
                double d3 = i2;
                return (d2 * (1.0d - (1.0d / d3))) + (d / d3);
            }
            double d4 = this.AEQbTJ;
            double d5 = stateListAnimator.OLrzqt;
            return (d4 * (d - d5)) + d5;
        }
    }

    public static class MediaController extends Matrix {
        public double AEQbTJ;
        public ComponentName copydefault;

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public void KWHzl() {
            super.KWHzl();
            this.AEQbTJ = this.copydefault.execute(0);
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            int iCopydefault = copydefault();
            if (iCopydefault == 0) {
                return Double.NaN;
            }
            int iEZpvd = ComponentCallbacks2.copydefault().EZpvd();
            if (iEZpvd < 0 || i <= iEZpvd) {
                return d;
            }
            int i2 = (i - iEZpvd) + 1;
            if (iCopydefault > i2) {
                iCopydefault = i2;
            }
            return ((((double) (iCopydefault - 1)) * this.KWHzl.get(i - 1).OLrzqt) + (d * this.AEQbTJ)) / ((double) iCopydefault);
        }

        public MediaController(ComponentName componentName, ComponentName componentName2, ComponentName componentName3) {
            super(componentName, componentName2);
            this.copydefault = componentName3;
        }
    }

    public static class Point extends Matrix {
        public Point(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            int iCopydefault = copydefault();
            if (iCopydefault == 0) {
                return Double.NaN;
            }
            int iEZpvd = ComponentCallbacks2.copydefault().EZpvd();
            return (iEZpvd >= 0 && i > iEZpvd) ? ((this.KWHzl.get(i - 1).OLrzqt * ((double) (iCopydefault - 1))) + d) / ((double) iCopydefault) : d;
        }
    }

    public static class Drawable extends SQLiteClosable {
        public ArrayList<ActionBar> AEQbTJ;
        public double EZpvd;
        public double OLrzqt;
        public int copydefault;
        public double djBIcL;

        public static class ActionBar {
            public double AEQbTJ;
            public double EZpvd;
            public boolean OLrzqt;
            public double copydefault;

            private ActionBar() {
            }
        }

        public Drawable(ComponentName componentName, ComponentName componentName2, ComponentName componentName3, ComponentName componentName4) {
            super(componentName, componentName2, componentName3, componentName4);
            this.copydefault = -1;
            this.AEQbTJ = new ArrayList<>();
        }

        @Override // com.okinc.kline.library.indicator.Expression.SQLiteClosable, com.okinc.kline.library.indicator.Expression.ComponentName
        public int getColor(int i) {
            if (this.copydefault < 0) {
                this.copydefault = (int) this.KWHzl.execute(0);
                this.OLrzqt = this.gEmmrt.execute(0) / 100.0d;
                this.djBIcL = this.valueOf.execute(0) / 100.0d;
                this.EZpvd = this.AYXKKw.execute(0) / 100.0d;
            }
            while (i >= this.AEQbTJ.size()) {
                this.AEQbTJ.add(new ActionBar());
            }
            ActionBar actionBar = this.AEQbTJ.get(i);
            int iEZpvd = ComponentCallbacks2.copydefault().EZpvd();
            if (iEZpvd < 0 || i <= 0) {
                actionBar.OLrzqt = true;
                actionBar.copydefault = ComponentCallbacks2.copydefault().AYXKKw(i);
                actionBar.EZpvd = ComponentCallbacks2.copydefault().AhwBna(i);
                actionBar.AEQbTJ = 0.02d;
                return 0;
            }
            double dAhwBna = ComponentCallbacks2.copydefault().AhwBna(i);
            double dAYXKKw = ComponentCallbacks2.copydefault().AYXKKw(i);
            ActionBar actionBar2 = this.AEQbTJ.get(i - 1);
            double d = actionBar2.copydefault;
            double d2 = actionBar2.AEQbTJ;
            double d3 = actionBar2.EZpvd;
            actionBar.copydefault = d + ((d3 - d) * d2);
            if (actionBar2.OLrzqt) {
                actionBar.OLrzqt = true;
                if (dAhwBna > d3) {
                    actionBar.EZpvd = dAhwBna;
                    actionBar.AEQbTJ = Math.min(d2 + this.djBIcL, this.EZpvd);
                } else {
                    actionBar.EZpvd = d3;
                    actionBar.AEQbTJ = d2;
                }
                if (actionBar.copydefault <= dAYXKKw) {
                    return 1;
                }
                actionBar.OLrzqt = false;
                for (int iMax = Math.max((i - this.copydefault) + 1, iEZpvd); iMax < i; iMax++) {
                    double dAhwBna2 = ComponentCallbacks2.copydefault().AhwBna(iMax);
                    if (dAhwBna < dAhwBna2) {
                        dAhwBna = dAhwBna2;
                    }
                }
                actionBar.copydefault = dAhwBna;
                actionBar.EZpvd = dAYXKKw;
                actionBar.AEQbTJ = 0.02d;
                return 0;
            }
            actionBar.OLrzqt = false;
            if (dAYXKKw < d3) {
                actionBar.EZpvd = dAYXKKw;
                actionBar.AEQbTJ = Math.min(d2 + this.djBIcL, this.EZpvd);
            } else {
                actionBar.EZpvd = d3;
                actionBar.AEQbTJ = d2;
            }
            if (actionBar.copydefault >= dAhwBna) {
                return 2;
            }
            actionBar.OLrzqt = true;
            for (int iMax2 = Math.max((i - this.copydefault) + 1, iEZpvd); iMax2 < i; iMax2++) {
                double dAYXKKw2 = ComponentCallbacks2.copydefault().AYXKKw(iMax2);
                if (dAYXKKw > dAYXKKw2) {
                    dAYXKKw = dAYXKKw2;
                }
            }
            actionBar.copydefault = dAYXKKw;
            actionBar.EZpvd = dAhwBna;
            actionBar.AEQbTJ = 0.02d;
            return 0;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            if (this.copydefault < 0) {
                this.copydefault = (int) this.KWHzl.execute(0);
                this.OLrzqt = this.gEmmrt.execute(0) / 100.0d;
                this.djBIcL = this.valueOf.execute(0) / 100.0d;
                this.EZpvd = this.AYXKKw.execute(0) / 100.0d;
            }
            while (i >= this.AEQbTJ.size()) {
                this.AEQbTJ.add(new ActionBar());
            }
            ActionBar actionBar = this.AEQbTJ.get(i);
            int iEZpvd = ComponentCallbacks2.copydefault().EZpvd();
            if (iEZpvd < 0 || i <= 0) {
                actionBar.OLrzqt = true;
                actionBar.copydefault = ComponentCallbacks2.copydefault().AYXKKw(i);
                actionBar.EZpvd = ComponentCallbacks2.copydefault().AhwBna(i);
                actionBar.AEQbTJ = 0.02d;
            } else {
                double dAhwBna = ComponentCallbacks2.copydefault().AhwBna(i);
                double dAYXKKw = ComponentCallbacks2.copydefault().AYXKKw(i);
                ActionBar actionBar2 = this.AEQbTJ.get(i - 1);
                double d = actionBar2.copydefault;
                double d2 = actionBar2.AEQbTJ;
                double d3 = actionBar2.EZpvd;
                actionBar.copydefault = d + ((d3 - d) * d2);
                if (actionBar2.OLrzqt) {
                    actionBar.OLrzqt = true;
                    if (dAhwBna > d3) {
                        actionBar.EZpvd = dAhwBna;
                        actionBar.AEQbTJ = Math.min(d2 + this.djBIcL, this.EZpvd);
                    } else {
                        actionBar.EZpvd = d3;
                        actionBar.AEQbTJ = d2;
                    }
                    if (actionBar.copydefault > dAYXKKw) {
                        actionBar.OLrzqt = false;
                        for (int iMax = Math.max((i - this.copydefault) + 1, iEZpvd); iMax < i; iMax++) {
                            double dAhwBna2 = ComponentCallbacks2.copydefault().AhwBna(iMax);
                            if (dAhwBna < dAhwBna2) {
                                dAhwBna = dAhwBna2;
                            }
                        }
                        actionBar.copydefault = dAhwBna;
                        actionBar.EZpvd = dAYXKKw;
                        actionBar.AEQbTJ = 0.02d;
                    }
                } else {
                    actionBar.OLrzqt = false;
                    if (dAYXKKw < d3) {
                        actionBar.EZpvd = dAYXKKw;
                        actionBar.AEQbTJ = Math.min(d2 + this.djBIcL, this.EZpvd);
                    } else {
                        actionBar.EZpvd = d3;
                        actionBar.AEQbTJ = d2;
                    }
                    if (actionBar.copydefault < dAhwBna) {
                        actionBar.OLrzqt = true;
                        for (int iMax2 = Math.max((i - this.copydefault) + 1, iEZpvd); iMax2 < i; iMax2++) {
                            double dAYXKKw2 = ComponentCallbacks2.copydefault().AYXKKw(iMax2);
                            if (dAYXKKw > dAYXKKw2) {
                                dAYXKKw = dAYXKKw2;
                            }
                        }
                        actionBar.copydefault = dAYXKKw;
                        actionBar.EZpvd = dAhwBna;
                        actionBar.AEQbTJ = 0.02d;
                    }
                }
            }
            return actionBar.copydefault;
        }

        @Override // com.okinc.kline.library.indicator.Expression.SQLiteClosable, com.okinc.kline.library.indicator.Expression.ComponentName
        public void clear() {
            super.clear();
            this.copydefault = -1;
        }
    }

    public static class PendingIntent extends Matrix {
        public PendingIntent(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            int iEZpvd;
            int iCopydefault = copydefault();
            if (iCopydefault == 0 || (iEZpvd = ComponentCallbacks2.copydefault().EZpvd()) < 0 || i <= iEZpvd) {
                return Double.NaN;
            }
            int i2 = (i - iEZpvd) + 1;
            if (iCopydefault > i2) {
                iCopydefault = i2;
            }
            int i3 = (i - iCopydefault) + 1;
            for (int i4 = i3; i4 < i; i4++) {
                d += this.KWHzl.get(i4).AEQbTJ;
            }
            double d2 = iCopydefault;
            double d3 = d / d2;
            double dAbs = AudioStats.AUDIO_AMPLITUDE_NONE;
            while (i3 <= i) {
                dAbs += Math.abs(this.KWHzl.get(i3).AEQbTJ - d3);
                i3++;
            }
            return dAbs / d2;
        }
    }

    public static class Handler extends SQLiteClosable {
        public ArrayList<Activity> copydefault;

        public static class Activity {
            public boolean AEQbTJ;
            public double EZpvd;
            public double KWHzl;
            public double OLrzqt;
            public double copydefault;

            private Activity() {
            }
        }

        public Handler(ComponentName componentName, ComponentName componentName2, ComponentName componentName3, ComponentName componentName4) {
            super(componentName, componentName2, componentName3, componentName4);
            this.copydefault = new ArrayList<>();
        }

        @Override // com.okinc.kline.library.indicator.Expression.SQLiteClosable, com.okinc.kline.library.indicator.Expression.ComponentName
        public int getColor(int i) {
            try {
                return this.copydefault.get(i).AEQbTJ ? 1 : 0;
            } catch (Exception unused) {
                return 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public double execute(int i) {
            while (i >= this.copydefault.size()) {
                double dKWHzl = ComponentCallbacks2.copydefault().KWHzl(this.copydefault.size());
                Activity activity = new Activity();
                activity.copydefault = dKWHzl;
                activity.KWHzl = dKWHzl;
                activity.OLrzqt = dKWHzl;
                activity.EZpvd = dKWHzl;
                activity.AEQbTJ = false;
                this.copydefault.add(activity);
            }
            Activity activity2 = this.copydefault.get(i);
            double dExecute = this.KWHzl.execute(i);
            double dExecute2 = this.gEmmrt.execute(i);
            double dExecute3 = this.valueOf.execute(i);
            double dKWHzl2 = ComponentCallbacks2.copydefault().KWHzl(i);
            double d = i;
            if (d == this.AYXKKw.execute(i)) {
                activity2.copydefault = dExecute;
                activity2.KWHzl = dExecute2;
                activity2.OLrzqt = dExecute;
            }
            if (d > this.AYXKKw.execute(i)) {
                int i2 = i - 1;
                Activity activity3 = this.copydefault.get(i2);
                double dKWHzl3 = ComponentCallbacks2.copydefault().KWHzl(i2);
                activity2.EZpvd = dExecute3;
                double d2 = activity3.copydefault;
                if (dExecute < d2 || dKWHzl3 > d2) {
                    activity2.copydefault = dExecute;
                } else {
                    activity2.copydefault = d2;
                }
                double d3 = activity3.KWHzl;
                if (dExecute2 > d3 || dKWHzl3 < d3) {
                    activity2.KWHzl = dExecute2;
                } else {
                    activity2.KWHzl = d3;
                }
                double d4 = activity3.OLrzqt;
                if (d4 == activity3.copydefault) {
                    double d5 = activity2.copydefault;
                    if (dKWHzl2 <= d5) {
                        activity2.OLrzqt = d5;
                        activity2.AEQbTJ = false;
                    } else if (d4 == activity3.KWHzl) {
                        double d6 = activity2.KWHzl;
                        if (dKWHzl2 >= d6) {
                            activity2.OLrzqt = d6;
                            activity2.AEQbTJ = true;
                        } else {
                            double d7 = activity2.KWHzl;
                            if (dKWHzl2 <= d7) {
                                activity2.OLrzqt = activity2.copydefault;
                                activity2.AEQbTJ = false;
                            } else {
                                activity2.OLrzqt = d7;
                                activity2.AEQbTJ = true;
                            }
                        }
                    }
                }
            }
            return activity2.OLrzqt;
        }

        public boolean AEQbTJ(int i) {
            if (i < 0 || i >= this.copydefault.size()) {
                return true;
            }
            return this.copydefault.get(i).AEQbTJ;
        }

        public double KWHzl(int i) {
            return (i < 0 || i >= this.copydefault.size()) ? AudioStats.AUDIO_AMPLITUDE_NONE : this.copydefault.get(i).EZpvd;
        }

        @Override // com.okinc.kline.library.indicator.Expression.SQLiteClosable, com.okinc.kline.library.indicator.Expression.ComponentName
        public void clear() {
            super.clear();
            this.copydefault.clear();
        }
    }

    public static class Theme extends SQLiteClosable {
        public boolean AEQbTJ;
        public double[] EZpvd;
        public double OLrzqt;
        public ArrayList<Activity> copydefault;

        public static class Activity {
            public double AEQbTJ;
            public double EZpvd;
            public double OLrzqt;
            public double copydefault;

            private Activity() {
            }
        }

        public Theme(ComponentName componentName, ComponentName componentName2, ComponentName componentName3, ComponentName componentName4) {
            super(componentName, componentName2, componentName3, componentName4);
            this.copydefault = new ArrayList<>();
            this.EZpvd = null;
            this.OLrzqt = AudioStats.AUDIO_AMPLITUDE_NONE;
            this.AEQbTJ = false;
        }

        public final double AEQbTJ(double d, double d2) {
            return Math.exp((-(d * d)) / ((d2 * d2) * 2.0d));
        }

        public final void AEQbTJ() {
            if (this.AEQbTJ) {
                return;
            }
            int iExecute = (int) this.AYXKKw.execute(0);
            double dExecute = this.gEmmrt.execute(0);
            this.EZpvd = new double[iExecute];
            this.OLrzqt = AudioStats.AUDIO_AMPLITUDE_NONE;
            for (int i = 0; i < iExecute; i++) {
                this.EZpvd[i] = AEQbTJ(i, dExecute);
                this.OLrzqt += this.EZpvd[i];
            }
            this.AEQbTJ = true;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            Activity activity;
            double d;
            int i2 = i;
            while (i2 >= this.copydefault.size()) {
                this.copydefault.add(new Activity());
            }
            AEQbTJ();
            Activity activity2 = this.copydefault.get(i2);
            double dExecute = this.KWHzl.execute(i2);
            double dExecute2 = this.valueOf.execute(i2);
            int iMax = Math.max(1, ((int) this.AYXKKw.execute(i2)) - 1);
            double d2 = this.OLrzqt;
            double d3 = AudioStats.AUDIO_AMPLITUDE_NONE;
            if (d2 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                double dExecute3 = 0.0d;
                for (int i3 = 0; i3 < Math.min(iMax, i2 + 1); i3++) {
                    int i4 = i2 - i3;
                    if (i4 >= 0 && i3 < this.EZpvd.length) {
                        dExecute3 += this.KWHzl.execute(i4) * this.EZpvd[i3];
                    }
                }
                dExecute = dExecute3 / this.OLrzqt;
            }
            if (i2 >= iMax) {
                double dAbs = 0.0d;
                int i5 = 0;
                while (i5 < iMax) {
                    int i6 = i2 - i5;
                    if (i6 >= 0) {
                        double dExecute4 = this.KWHzl.execute(i6);
                        if (i6 < this.copydefault.size()) {
                            activity = activity2;
                            if (this.copydefault.get(i6).copydefault != AudioStats.AUDIO_AMPLITUDE_NONE) {
                                d = this.copydefault.get(i6).copydefault;
                            }
                            dAbs += Math.abs(dExecute4 - d);
                        } else {
                            activity = activity2;
                        }
                        if (this.OLrzqt > AudioStats.AUDIO_AMPLITUDE_NONE) {
                            double dExecute5 = 0.0d;
                            for (int i7 = 0; i7 < Math.min(iMax, i6 + 1); i7++) {
                                int i8 = i6 - i7;
                                if (i8 >= 0 && i7 < this.EZpvd.length) {
                                    dExecute5 += this.KWHzl.execute(i8) * this.EZpvd[i7];
                                }
                            }
                            d = dExecute5 / this.OLrzqt;
                        } else {
                            d = dExecute4;
                        }
                        if (i6 < this.copydefault.size()) {
                            this.copydefault.get(i6).copydefault = d;
                        }
                        dAbs += Math.abs(dExecute4 - d);
                    } else {
                        activity = activity2;
                    }
                    i5++;
                    i2 = i;
                    activity2 = activity;
                }
                d3 = (dAbs / ((double) iMax)) * dExecute2;
                activity2 = activity2;
            }
            activity2.copydefault = dExecute;
            activity2.EZpvd = dExecute + d3;
            activity2.OLrzqt = dExecute - d3;
            activity2.AEQbTJ = d3;
            return dExecute;
        }

        public double KWHzl(int i) {
            return (i < 0 || i >= this.copydefault.size()) ? AudioStats.AUDIO_AMPLITUDE_NONE : this.copydefault.get(i).EZpvd;
        }

        public double OLrzqt(int i) {
            return (i < 0 || i >= this.copydefault.size()) ? AudioStats.AUDIO_AMPLITUDE_NONE : this.copydefault.get(i).OLrzqt;
        }

        @Override // com.okinc.kline.library.indicator.Expression.SQLiteClosable, com.okinc.kline.library.indicator.Expression.ComponentName
        public void clear() {
            super.clear();
            this.copydefault.clear();
            this.EZpvd = null;
            this.OLrzqt = AudioStats.AUDIO_AMPLITUDE_NONE;
            this.AEQbTJ = false;
        }
    }

    public static class DatabaseErrorHandler extends ComponentName {
        public ActionBar copydefault;

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        public DatabaseErrorHandler(ActionBar actionBar) {
            super();
            this.copydefault = actionBar;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            ComponentName componentName = this.copydefault.copydefault;
            return componentName instanceof Theme ? ((Theme) componentName).KWHzl(i) : AudioStats.AUDIO_AMPLITUDE_NONE;
        }
    }

    public static class TypedArray extends ComponentName {
        public ActionBar EZpvd;

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ void clear() {
            super.clear();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public /* bridge */ /* synthetic */ int getColor(int i) {
            return super.getColor(i);
        }

        public TypedArray(ActionBar actionBar) {
            super();
            this.EZpvd = actionBar;
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentName
        public double execute(int i) {
            ComponentName componentName = this.EZpvd.copydefault;
            return componentName instanceof Theme ? ((Theme) componentName).OLrzqt(i) : AudioStats.AUDIO_AMPLITUDE_NONE;
        }
    }

    public static class Environment extends Matrix {
        public ArrayList<Activity> copydefault;

        public static class Activity {
            public double AEQbTJ;
            public double AYXKKw;
            public boolean EZpvd;
            public double KWHzl;
            public double OLrzqt;
            public double copydefault;

            private Activity() {
            }
        }

        public Environment(ComponentName componentName, ComponentName componentName2) {
            super(componentName, componentName2);
            this.copydefault = new ArrayList<>();
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix
        public double AEQbTJ(int i, double d) {
            int iCopydefault;
            if (!"TYPE_KLINE".equals(C36246oUr.copydefault().UeEOUB()) || (iCopydefault = copydefault()) == 0) {
                return Double.NaN;
            }
            while (true) {
                byte b = 0;
                if (i < this.copydefault.size()) {
                    break;
                }
                this.copydefault.add(new Activity());
            }
            Activity activity = this.copydefault.get(i);
            ComponentCallbacks2 componentCallbacks2Copydefault = ComponentCallbacks2.copydefault();
            double dAhwBna = componentCallbacks2Copydefault.AhwBna(i);
            double dAYXKKw = componentCallbacks2Copydefault.AYXKKw(i);
            double dKWHzl = componentCallbacks2Copydefault.KWHzl(i);
            double dAkhnZx = componentCallbacks2Copydefault.AkhnZx(i);
            if (Double.isNaN(dAhwBna) || Double.isNaN(dAYXKKw) || Double.isNaN(dKWHzl)) {
                activity.EZpvd = false;
                activity.AYXKKw = Double.NaN;
                return Double.NaN;
            }
            double d2 = ((dAhwBna + dAYXKKw) + dKWHzl) / 3.0d;
            if (Double.isNaN(dAkhnZx)) {
                dAkhnZx = AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            int iEZpvd = componentCallbacks2Copydefault.EZpvd();
            activity.KWHzl = d2 * dAkhnZx;
            activity.AEQbTJ = dAkhnZx;
            activity.EZpvd = true;
            Activity activity2 = i > 0 ? this.copydefault.get(i - 1) : null;
            if (iEZpvd < 0) {
                iEZpvd = i;
            }
            if ((i - iEZpvd) + 1 < iCopydefault) {
                activity.AYXKKw = Double.NaN;
                return Double.NaN;
            }
            double d3 = AudioStats.AUDIO_AMPLITUDE_NONE;
            double d4 = AudioStats.AUDIO_AMPLITUDE_NONE;
            for (int i2 = (i - iCopydefault) + 1; i2 <= i; i2++) {
                if (i2 >= 0 && i2 < this.copydefault.size()) {
                    Activity activity3 = this.copydefault.get(i2);
                    if (activity3.EZpvd) {
                        d3 += activity3.KWHzl;
                        d4 += activity3.AEQbTJ;
                    }
                }
            }
            activity.copydefault = d3;
            activity.OLrzqt = d4;
            if (d4 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                d2 = d3 / d4;
            } else if (activity2 != null && !Double.isNaN(activity2.AYXKKw)) {
                d2 = activity2.AYXKKw;
            }
            activity.AYXKKw = d2;
            return d2;
        }

        @Override // com.okinc.kline.library.indicator.Expression.Matrix, com.okinc.kline.library.indicator.Expression.CursorFactory, com.okinc.kline.library.indicator.Expression.ComponentName
        public void clear() {
            super.clear();
            this.copydefault.clear();
        }
    }
}
