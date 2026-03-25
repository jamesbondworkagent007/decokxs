package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
public interface jKG {
    @GET("/priapi/v5/journal/app-calendar-highlight")
    java.lang.Object OLrzqt(@NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) java.lang.String str, @Query("valuationUnit") java.lang.String str2, @Query("uid") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<jKO>>> continuation);
}
