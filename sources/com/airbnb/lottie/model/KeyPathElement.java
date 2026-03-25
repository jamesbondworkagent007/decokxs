package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface KeyPathElement {
    <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback);

    void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2);
}
