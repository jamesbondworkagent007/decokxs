package com.amplifyframework.predictions.models;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.amplifyframework.util.Immutable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class Landmark {
    private final List<PointF> points;
    private final LandmarkType type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LandmarkType getType() {
        return this.type;
    }

    public Landmark(@NonNull LandmarkType landmarkType, @NonNull List<PointF> list) {
        Objects.requireNonNull(landmarkType);
        this.type = landmarkType;
        Objects.requireNonNull(list);
        this.points = list;
    }

    public List<PointF> getPoints() {
        return Immutable.of(this.points);
    }
}
