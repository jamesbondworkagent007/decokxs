package com.airbnb.lottie.animation.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RoundedCornersContent implements ShapeModifierContent, BaseKeyframeAnimation.AnimationListener {
    private static final float ROUNDED_CORNER_MAGIC_NUMBER = 0.5519f;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<Float, Float> roundedCorners;
    private ShapeData shapeData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseKeyframeAnimation<Float, Float> getRoundedCorners() {
        return this.roundedCorners;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }

    public RoundedCornersContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RoundedCorners roundedCorners) {
        this.lottieDrawable = lottieDrawable;
        this.name = roundedCorners.getName();
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = roundedCorners.getCornerRadius().createAnimation();
        this.roundedCorners = baseKeyframeAnimationCreateAnimation;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShapeData modifyShape(ShapeData shapeData) {
        boolean z;
        List<CubicCurveData> list;
        ShapeData shapeData2;
        List<CubicCurveData> list2;
        int i;
        List<CubicCurveData> curves = shapeData.getCurves();
        if (curves.size() <= 2) {
            return shapeData;
        }
        float fFloatValue = this.roundedCorners.getValue().floatValue();
        if (fFloatValue == 0.0f) {
            return shapeData;
        }
        ShapeData shapeData3 = getShapeData(shapeData);
        shapeData3.setInitialPoint(shapeData.getInitialPoint().x, shapeData.getInitialPoint().y);
        List<CubicCurveData> curves2 = shapeData3.getCurves();
        boolean zIsClosed = shapeData.isClosed();
        int i2 = 0;
        int i3 = 0;
        while (i2 < curves.size()) {
            CubicCurveData cubicCurveData = curves.get(i2);
            CubicCurveData cubicCurveData2 = curves.get(floorMod(i2 - 1, curves.size()));
            CubicCurveData cubicCurveData3 = curves.get(floorMod(i2 - 2, curves.size()));
            PointF vertex = (i2 != 0 || zIsClosed) ? cubicCurveData2.getVertex() : shapeData.getInitialPoint();
            PointF controlPoint2 = (i2 != 0 || zIsClosed) ? cubicCurveData2.getControlPoint2() : vertex;
            PointF controlPoint1 = cubicCurveData.getControlPoint1();
            PointF vertex2 = cubicCurveData3.getVertex();
            PointF vertex3 = cubicCurveData.getVertex();
            if (!shapeData.isClosed()) {
                z = true;
                if (i2 != 0 && i2 != curves.size() - 1) {
                    z = false;
                }
            }
            if (controlPoint2.equals(vertex) && controlPoint1.equals(vertex) && !z) {
                float f = vertex.x;
                float f2 = vertex2.x;
                float f3 = vertex.y;
                float f4 = vertex2.y;
                float f5 = vertex3.x;
                list = curves;
                float f6 = vertex3.y;
                ShapeData shapeData4 = shapeData3;
                List<CubicCurveData> list3 = curves2;
                double d = f - f2;
                float f7 = f3 - f4;
                i = i2;
                int i4 = i3;
                float fHypot = (float) Math.hypot(d, f7);
                float fHypot2 = (float) Math.hypot(f5 - f, f6 - f3);
                float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                float f8 = vertex.x;
                float f9 = ((vertex2.x - f8) * fMin) + f8;
                float f10 = vertex.y;
                float f11 = ((vertex2.y - f10) * fMin) + f10;
                float f12 = ((vertex3.x - f8) * fMin2) + f8;
                float f13 = ((vertex3.y - f10) * fMin2) + f10;
                list2 = list3;
                CubicCurveData cubicCurveData4 = list2.get(floorMod(i4 - 1, list3.size()));
                CubicCurveData cubicCurveData5 = list2.get(i4);
                cubicCurveData4.setControlPoint2(f9, f11);
                cubicCurveData4.setVertex(f9, f11);
                shapeData2 = shapeData4;
                if (i == 0) {
                    shapeData2.setInitialPoint(f9, f11);
                }
                cubicCurveData5.setControlPoint1(f9 - ((f9 - f8) * ROUNDED_CORNER_MAGIC_NUMBER), f11 - ((f11 - f10) * ROUNDED_CORNER_MAGIC_NUMBER));
                CubicCurveData cubicCurveData6 = list2.get(i4 + 1);
                cubicCurveData5.setControlPoint2(f12 - ((f12 - f8) * ROUNDED_CORNER_MAGIC_NUMBER), f13 - ((f13 - f10) * ROUNDED_CORNER_MAGIC_NUMBER));
                cubicCurveData5.setVertex(f12, f13);
                cubicCurveData6.setControlPoint1(f12, f13);
                i3 = i4 + 2;
            } else {
                list = curves;
                shapeData2 = shapeData3;
                list2 = curves2;
                i = i2;
                int i5 = i3;
                CubicCurveData cubicCurveData7 = list2.get(floorMod(i5 - 1, list2.size()));
                CubicCurveData cubicCurveData8 = list2.get(i5);
                cubicCurveData7.setControlPoint2(cubicCurveData2.getControlPoint2().x, cubicCurveData2.getControlPoint2().y);
                cubicCurveData7.setVertex(cubicCurveData2.getVertex().x, cubicCurveData2.getVertex().y);
                cubicCurveData8.setControlPoint1(cubicCurveData.getControlPoint1().x, cubicCurveData.getControlPoint1().y);
                i3 = i5 + 1;
            }
            i2 = i + 1;
            shapeData3 = shapeData2;
            curves2 = list2;
            curves = list;
        }
        return shapeData3;
    }

    private ShapeData getShapeData(ShapeData shapeData) {
        List<CubicCurveData> curves = shapeData.getCurves();
        boolean zIsClosed = shapeData.isClosed();
        int size = curves.size() - 1;
        int i = 0;
        while (size >= 0) {
            CubicCurveData cubicCurveData = curves.get(size);
            CubicCurveData cubicCurveData2 = curves.get(floorMod(size - 1, curves.size()));
            PointF vertex = (size != 0 || zIsClosed) ? cubicCurveData2.getVertex() : shapeData.getInitialPoint();
            i = (((size != 0 || zIsClosed) ? cubicCurveData2.getControlPoint2() : vertex).equals(vertex) && cubicCurveData.getControlPoint1().equals(vertex) && !(!shapeData.isClosed() && (size == 0 || size == curves.size() - 1))) ? i + 2 : i + 1;
            size--;
        }
        ShapeData shapeData2 = this.shapeData;
        if (shapeData2 == null || shapeData2.getCurves().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new CubicCurveData());
            }
            this.shapeData = new ShapeData(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.shapeData.setClosed(zIsClosed);
        return this.shapeData;
    }

    private static int floorMod(int i, int i2) {
        return i - (floorDiv(i, i2) * i2);
    }

    private static int floorDiv(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }
}
