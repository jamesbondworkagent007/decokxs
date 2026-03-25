package com.amplifyframework.predictions.aws.adapter;

import com.amplifyframework.predictions.models.LandmarkType;
import kotlin.jvm.internal.Intrinsics;
import o.E;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class LandmarkTypeAdapter {
    public static final LandmarkTypeAdapter INSTANCE = new LandmarkTypeAdapter();

    private LandmarkTypeAdapter() {
    }

    public static final LandmarkType fromRekognition(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        E eCopydefault = E.OLrzqt.copydefault(str);
        if (Intrinsics.EZpvd(eCopydefault, E.TaskDescription.KWHzl) || Intrinsics.EZpvd(eCopydefault, E.PendingIntent.KWHzl) || Intrinsics.EZpvd(eCopydefault, E.Dialog.KWHzl) || Intrinsics.EZpvd(eCopydefault, E.AssistContent.KWHzl) || Intrinsics.EZpvd(eCopydefault, E.FragmentManager.EZpvd)) {
            return LandmarkType.LEFT_EYE;
        }
        if (Intrinsics.EZpvd(eCopydefault, E.ActionBar.EZpvd) || Intrinsics.EZpvd(eCopydefault, E.IntentFilter.EZpvd) || Intrinsics.EZpvd(eCopydefault, E.ServiceConnection.KWHzl) || Intrinsics.EZpvd(eCopydefault, E.ApplicationInfo.EZpvd) || Intrinsics.EZpvd(eCopydefault, E.ContentResolver.KWHzl)) {
            return LandmarkType.RIGHT_EYE;
        }
        if (Intrinsics.EZpvd(eCopydefault, E.StateListAnimator.EZpvd) || Intrinsics.EZpvd(eCopydefault, E.Fragment.KWHzl) || Intrinsics.EZpvd(eCopydefault, E.LoaderManager.AEQbTJ)) {
            return LandmarkType.LEFT_EYEBROW;
        }
        if (Intrinsics.EZpvd(eCopydefault, E.ContextWrapper.EZpvd) || Intrinsics.EZpvd(eCopydefault, E.Intent.KWHzl) || Intrinsics.EZpvd(eCopydefault, E.DialogInterface.EZpvd)) {
            return LandmarkType.RIGHT_EYEBROW;
        }
        if (Intrinsics.EZpvd(eCopydefault, E.ComponentCallbacks.AEQbTJ)) {
            return LandmarkType.NOSE;
        }
        if (Intrinsics.EZpvd(eCopydefault, E.ClipData.EZpvd) || Intrinsics.EZpvd(eCopydefault, E.Context.EZpvd)) {
            return LandmarkType.NOSE_CREST;
        }
        if (Intrinsics.EZpvd(eCopydefault, E.BroadcastReceiver.EZpvd) || Intrinsics.EZpvd(eCopydefault, E.ComponentName.KWHzl) || Intrinsics.EZpvd(eCopydefault, E.ComponentCallbacks2.EZpvd) || Intrinsics.EZpvd(eCopydefault, E.TaskStackBuilder.AEQbTJ)) {
            return LandmarkType.OUTER_LIPS;
        }
        if (Intrinsics.EZpvd(eCopydefault, E.PictureInPictureParams.KWHzl)) {
            return LandmarkType.LEFT_PUPIL;
        }
        if (Intrinsics.EZpvd(eCopydefault, E.SharedPreferences.AEQbTJ)) {
            return LandmarkType.RIGHT_PUPIL;
        }
        if (Intrinsics.EZpvd(eCopydefault, E.Configuration.AEQbTJ) || Intrinsics.EZpvd(eCopydefault, E.VoiceInteractor.EZpvd) || Intrinsics.EZpvd(eCopydefault, E.Application.AEQbTJ) || Intrinsics.EZpvd(eCopydefault, E.SharedElementCallback.KWHzl) || Intrinsics.EZpvd(eCopydefault, E.PackageItemInfo.EZpvd)) {
            return LandmarkType.FACE_CONTOUR;
        }
        return LandmarkType.UNKNOWN;
    }
}
