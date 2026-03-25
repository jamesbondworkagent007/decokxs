package o;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.ImageBitmap;

/* JADX INFO: loaded from: classes23.dex */
public final class mDG {
    public static final ImageBitmap AEQbTJ(MutableState<ImageBitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final void EZpvd(MutableState<ImageBitmap> mutableState, ImageBitmap imageBitmap) {
        mutableState.setValue(imageBitmap);
    }
}
