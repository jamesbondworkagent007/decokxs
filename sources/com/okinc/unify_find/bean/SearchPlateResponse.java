package com.okinc.unify_find.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchPlateResponse {
    public static final int $stable = 8;

    @SerializedName("plate")
    private final Plate plate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SearchPlateResponse copy$default(SearchPlateResponse searchPlateResponse, Plate plate, int i, Object obj) {
        if ((i & 1) != 0) {
            plate = searchPlateResponse.plate;
        }
        return searchPlateResponse.copy(plate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Plate component1() {
        return this.plate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchPlateResponse copy(@NotNull Plate plate) {
        Intrinsics.checkNotNullParameter(plate, "");
        return new SearchPlateResponse(plate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchPlateResponse) && Intrinsics.EZpvd(this.plate, ((SearchPlateResponse) obj).plate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Plate getPlate() {
        return this.plate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.plate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchPlateResponse(plate=" + this.plate + ")";
    }

    public SearchPlateResponse(@NotNull Plate plate) {
        Intrinsics.checkNotNullParameter(plate, "");
        this.plate = plate;
    }
}
