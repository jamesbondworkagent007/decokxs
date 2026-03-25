package com.amplifyframework.hub;

import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class HubEventFilters {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$always$0(HubEvent hubEvent) {
        return true;
    }

    private HubEventFilters() {
        throw new UnsupportedOperationException("No instances of the HubEventFilters utility, please.");
    }

    public static HubEventFilter always() {
        return new HubEventFilter() { // from class: com.amplifyframework.hub.HubEventFilters$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.hub.HubEventFilter
            public final boolean filter(HubEvent hubEvent) {
                return HubEventFilters.lambda$always$0(hubEvent);
            }
        };
    }

    public static HubEventFilter all(@NonNull final HubEventFilter... hubEventFilterArr) {
        return new HubEventFilter() { // from class: com.amplifyframework.hub.HubEventFilters$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.hub.HubEventFilter
            public final boolean filter(HubEvent hubEvent) {
                return HubEventFilters.lambda$all$1(hubEventFilterArr, hubEvent);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$all$1(HubEventFilter[] hubEventFilterArr, HubEvent hubEvent) {
        boolean zFilter = true;
        for (HubEventFilter hubEventFilter : hubEventFilterArr) {
            if (hubEventFilter != null) {
                zFilter &= hubEventFilter.filter(hubEvent);
            }
        }
        return zFilter;
    }

    public static HubEventFilter any(@NonNull final HubEventFilter... hubEventFilterArr) {
        return new HubEventFilter() { // from class: com.amplifyframework.hub.HubEventFilters$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.hub.HubEventFilter
            public final boolean filter(HubEvent hubEvent) {
                return HubEventFilters.lambda$any$2(hubEventFilterArr, hubEvent);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$any$2(HubEventFilter[] hubEventFilterArr, HubEvent hubEvent) {
        boolean zFilter = false;
        for (HubEventFilter hubEventFilter : hubEventFilterArr) {
            if (hubEventFilter != null) {
                zFilter |= hubEventFilter.filter(hubEvent);
            }
        }
        return zFilter;
    }

    public static HubEventFilter and(@NonNull final HubEventFilter hubEventFilter, @NonNull final HubEventFilter hubEventFilter2) {
        Objects.requireNonNull(hubEventFilter);
        Objects.requireNonNull(hubEventFilter2);
        return new HubEventFilter() { // from class: com.amplifyframework.hub.HubEventFilters$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.hub.HubEventFilter
            public final boolean filter(HubEvent hubEvent) {
                return HubEventFilters.lambda$and$3(hubEventFilter, hubEventFilter2, hubEvent);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$and$3(HubEventFilter hubEventFilter, HubEventFilter hubEventFilter2, HubEvent hubEvent) {
        return hubEventFilter.filter(hubEvent) && hubEventFilter2.filter(hubEvent);
    }

    public static HubEventFilter or(@NonNull final HubEventFilter hubEventFilter, @NonNull final HubEventFilter hubEventFilter2) {
        Objects.requireNonNull(hubEventFilter);
        Objects.requireNonNull(hubEventFilter2);
        return new HubEventFilter() { // from class: com.amplifyframework.hub.HubEventFilters$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.hub.HubEventFilter
            public final boolean filter(HubEvent hubEvent) {
                return HubEventFilters.lambda$or$4(hubEventFilter, hubEventFilter2, hubEvent);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$or$4(HubEventFilter hubEventFilter, HubEventFilter hubEventFilter2, HubEvent hubEvent) {
        return hubEventFilter.filter(hubEvent) || hubEventFilter2.filter(hubEvent);
    }
}
