package com.amplifyframework.predictions.aws.adapter;

import com.amplifyframework.predictions.models.SpeechType;
import kotlin.jvm.internal.Intrinsics;
import o.VolumeInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SpeechTypeAdapter {
    public static final SpeechTypeAdapter INSTANCE = new SpeechTypeAdapter();

    private SpeechTypeAdapter() {
    }

    public static final SpeechType fromComprehend(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        VolumeInfo volumeInfoCopydefault = VolumeInfo.copydefault.copydefault(str);
        return Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.ActionBar.OLrzqt) ? SpeechType.ADJECTIVE : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.TaskDescription.KWHzl) ? SpeechType.ADPOSITION : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.Activity.OLrzqt) ? SpeechType.ADVERB : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.StateListAnimator.KWHzl) ? SpeechType.AUXILIARY : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.Application.OLrzqt) ? SpeechType.COORDINATING_CONJUNCTION : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.Fragment.AEQbTJ) ? SpeechType.DETERMINER : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.Dialog.AEQbTJ) ? SpeechType.INTERJECTION : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.PendingIntent.AEQbTJ) ? SpeechType.NOUN : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.VoiceInteractor.KWHzl) ? SpeechType.NUMERAL : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.TaskStackBuilder.KWHzl) ? SpeechType.PARTICLE : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.AssistContent.KWHzl) ? SpeechType.PRONOUN : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.SharedElementCallback.OLrzqt) ? SpeechType.PROPER_NOUN : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.ClipData.KWHzl) ? SpeechType.PUNCTUATION : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.ComponentCallbacks.OLrzqt) ? SpeechType.SUBORDINATING_CONJUNCTION : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.ComponentCallbacks2.KWHzl) ? SpeechType.SYMBOL : Intrinsics.EZpvd(volumeInfoCopydefault, VolumeInfo.ComponentName.AEQbTJ) ? SpeechType.VERB : SpeechType.UNKNOWN;
    }
}
