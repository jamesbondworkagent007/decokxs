package o;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class uBZ {
    public static final uBZ AEQbTJ = new uBZ();

    private uBZ() {
    }

    public static /* synthetic */ android.graphics.drawable.Drawable createGradientFill$default(uBZ ubz, android.content.Context context, float f, float f2, float f3, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            f3 = 0.12f;
        }
        return ubz.AEQbTJ(context, f, f2, f3);
    }

    public final android.graphics.drawable.Drawable AEQbTJ(@NotNull android.content.Context context, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(context, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iZLjUOn = c33512mxp.zLjUOn(context, 0.0f);
        int iZLjUOn2 = c33512mxp.zLjUOn(context, f3);
        if (f >= 0.0f) {
            arrayList.add(java.lang.Integer.valueOf(iZLjUOn2));
            arrayList.add(java.lang.Integer.valueOf(iZLjUOn));
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
        }
        if (f2 <= 0.0f) {
            arrayList.add(java.lang.Integer.valueOf(iZLjUOn));
            arrayList.add(java.lang.Integer.valueOf(iZLjUOn2));
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
        }
        arrayList.add(java.lang.Integer.valueOf(iZLjUOn2));
        arrayList.add(java.lang.Integer.valueOf(iZLjUOn));
        arrayList.add(java.lang.Integer.valueOf(iZLjUOn2));
        float fAbs = f2 == f ? 0.5f : f2 / java.lang.Math.abs(f2 - f);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(new StateListAnimator(arrayList, fAbs));
        return paintDrawable;
    }

    public static final class StateListAnimator extends ShapeDrawable.ShaderFactory {
        public final /* synthetic */ float OLrzqt;
        public final /* synthetic */ java.util.ArrayList<java.lang.Integer> copydefault;

        public StateListAnimator(java.util.ArrayList<java.lang.Integer> arrayList, float f) {
            this.copydefault = arrayList;
            this.OLrzqt = f;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, C33129mqd.djBIcL(java.lang.Integer.valueOf(i2)), CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) this.copydefault), new float[]{0.0f, this.OLrzqt, 1.0f}, Shader.TileMode.REPEAT);
        }
    }

    public final android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(context, "");
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iZLjUOn = c33512mxp.zLjUOn(context, 0.0f);
        int iZLjUOn2 = c33512mxp.zLjUOn(context, f3);
        int iIsConnected = c33512mxp.isConnected(context, 0.0f);
        int iIsConnected2 = c33512mxp.isConnected(context, f4);
        if (f >= 0.0f) {
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iZLjUOn2, iZLjUOn});
        }
        if (f2 <= 0.0f) {
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iIsConnected, iIsConnected2});
        }
        float fAbs = f2 == f ? 0.5f : f2 / java.lang.Math.abs(f2 - f);
        float[] fArr = {0.0f, fAbs, fAbs, 1.0f};
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(new Activity(new int[]{iZLjUOn2, iZLjUOn, iIsConnected, iIsConnected2}, fArr));
        return paintDrawable;
    }

    public static final class Activity extends ShapeDrawable.ShaderFactory {
        public final /* synthetic */ int[] AEQbTJ;
        public final /* synthetic */ float[] OLrzqt;

        public Activity(int[] iArr, float[] fArr) {
            this.AEQbTJ = iArr;
            this.OLrzqt = fArr;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, C33129mqd.djBIcL(java.lang.Integer.valueOf(i2)), this.AEQbTJ, this.OLrzqt, Shader.TileMode.REPEAT);
        }
    }
}
