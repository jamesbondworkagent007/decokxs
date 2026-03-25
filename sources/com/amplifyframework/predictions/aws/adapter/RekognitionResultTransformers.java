package com.amplifyframework.predictions.aws.adapter;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.amplifyframework.predictions.aws.models.BinaryFeatureType;
import com.amplifyframework.predictions.models.AgeRange;
import com.amplifyframework.predictions.models.BinaryFeature;
import com.amplifyframework.predictions.models.IdentifiedText;
import com.amplifyframework.predictions.models.Landmark;
import com.amplifyframework.predictions.models.LandmarkType;
import com.amplifyframework.predictions.models.Polygon;
import com.amplifyframework.predictions.models.Pose;
import com.amplifyframework.util.Empty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C;
import o.C11967ce;
import o.C7980au;
import o.C8084aw;
import o.SmartSelectSprite;
import o.WebSyncManager;
import o.WebViewZygote;

/* JADX INFO: loaded from: classes14.dex */
public final class RekognitionResultTransformers {
    private RekognitionResultTransformers() {
    }

    public static RectF fromBoundingBox(@Nullable WebViewZygote webViewZygote) {
        if (webViewZygote == null || webViewZygote.EZpvd() == null || webViewZygote.copydefault() == null || webViewZygote.AEQbTJ() == null || webViewZygote.KWHzl() == null) {
            return null;
        }
        return new RectF(webViewZygote.EZpvd().floatValue(), webViewZygote.copydefault().floatValue(), webViewZygote.EZpvd().floatValue() + webViewZygote.AEQbTJ().floatValue(), webViewZygote.copydefault().floatValue() + webViewZygote.KWHzl().floatValue());
    }

    public static Polygon fromPoints(@Nullable List<C7980au> list) {
        if (Empty.check(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C7980au c7980au : list) {
            if (c7980au.EZpvd() == null || c7980au.AEQbTJ() == null) {
                return null;
            }
            arrayList.add(new PointF(c7980au.EZpvd().floatValue(), c7980au.AEQbTJ().floatValue()));
        }
        return Polygon.fromPoints(arrayList);
    }

    public static Pose fromRekognitionPose(@Nullable C8084aw c8084aw) {
        if (c8084aw == null || c8084aw.EZpvd() == null || c8084aw.AEQbTJ() == null || c8084aw.copydefault() == null) {
            return null;
        }
        return new Pose(c8084aw.EZpvd().floatValue(), c8084aw.AEQbTJ().floatValue(), c8084aw.copydefault().floatValue());
    }

    public static AgeRange fromRekognitionAgeRange(@Nullable WebSyncManager webSyncManager) {
        if (webSyncManager == null || webSyncManager.EZpvd() == null || webSyncManager.OLrzqt() == null) {
            return null;
        }
        return new AgeRange(webSyncManager.EZpvd().intValue(), webSyncManager.OLrzqt().intValue());
    }

    public static IdentifiedText fromTextDetection(@Nullable C11967ce c11967ce) {
        if (c11967ce == null || c11967ce.copydefault() == null || c11967ce.OLrzqt() == null) {
            return null;
        }
        return ((IdentifiedText.Builder) ((IdentifiedText.Builder) ((IdentifiedText.Builder) IdentifiedText.builder().text(c11967ce.copydefault()).confidence(c11967ce.OLrzqt().floatValue())).box(c11967ce.EZpvd() != null ? fromBoundingBox(c11967ce.EZpvd().copydefault()) : null)).polygon(fromPoints(c11967ce.EZpvd().EZpvd()))).build();
    }

    public static List<Landmark> fromLandmarks(@Nullable List<C> list) {
        ArrayList arrayList = new ArrayList();
        if (Empty.check(list)) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        for (C c : list) {
            if (c.OLrzqt() != null && c.copydefault() != null && c.EZpvd() != null) {
                LandmarkType landmarkTypeFromRekognition = LandmarkTypeAdapter.fromRekognition(c.OLrzqt().copydefault());
                PointF pointF = new PointF(c.copydefault().floatValue(), c.EZpvd().floatValue());
                List arrayList3 = (List) map.get(landmarkTypeFromRekognition);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    map.put(landmarkTypeFromRekognition, arrayList3);
                }
                arrayList3.add(pointF);
                arrayList2.add(pointF);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Landmark((LandmarkType) entry.getKey(), (List) entry.getValue()));
        }
        arrayList.add(new Landmark(LandmarkType.ALL_POINTS, arrayList2));
        return arrayList;
    }

    public static List<BinaryFeature> fromFaceDetail(SmartSelectSprite smartSelectSprite) {
        ArrayList arrayList = new ArrayList();
        if (smartSelectSprite.AEQbTJ() != null && smartSelectSprite.AEQbTJ().AEQbTJ() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.BEARD.getAlias()).value(Boolean.valueOf(smartSelectSprite.AEQbTJ().KWHzl()))).confidence(smartSelectSprite.AEQbTJ().AEQbTJ().floatValue())).build());
        }
        if (smartSelectSprite.fJNWhG() != null && smartSelectSprite.fJNWhG().EZpvd() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.SUNGLASSES.getAlias()).value(Boolean.valueOf(smartSelectSprite.fJNWhG().KWHzl()))).confidence(smartSelectSprite.fJNWhG().EZpvd().floatValue())).build());
        }
        if (smartSelectSprite.AuCTel() != null && smartSelectSprite.AuCTel().EZpvd() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.SMILE.getAlias()).value(Boolean.valueOf(smartSelectSprite.AuCTel().AEQbTJ()))).confidence(smartSelectSprite.AuCTel().EZpvd().floatValue())).build());
        }
        if (smartSelectSprite.AYXKKw() != null && smartSelectSprite.AYXKKw().EZpvd() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.EYE_GLASSES.getAlias()).value(Boolean.valueOf(smartSelectSprite.AYXKKw().AEQbTJ()))).confidence(smartSelectSprite.AYXKKw().EZpvd().floatValue())).build());
        }
        if (smartSelectSprite.AkhnZx() != null && smartSelectSprite.AkhnZx().OLrzqt() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.MUSTACHE.getAlias()).value(Boolean.valueOf(smartSelectSprite.AkhnZx().KWHzl()))).confidence(smartSelectSprite.AkhnZx().OLrzqt().floatValue())).build());
        }
        if (smartSelectSprite.isConnected() != null && smartSelectSprite.isConnected().EZpvd() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.MOUTH_OPEN.getAlias()).value(Boolean.valueOf(smartSelectSprite.isConnected().KWHzl()))).confidence(smartSelectSprite.isConnected().EZpvd().floatValue())).build());
        }
        if (smartSelectSprite.AhwBna() != null && smartSelectSprite.AhwBna().EZpvd() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.EYES_OPEN.getAlias()).value(Boolean.valueOf(smartSelectSprite.AhwBna().AEQbTJ()))).confidence(smartSelectSprite.AhwBna().EZpvd().floatValue())).build());
        }
        return arrayList;
    }
}
