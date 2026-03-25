package o;

import com.okinc.localization.LocalizeResources;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pSv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38277pSv extends android.content.ContextWrapper {
    public final InterfaceC56387yDm OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38277pSv(@NotNull final android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pSx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38277pSv.AEQbTJ(context);
            }
        });
    }

    public final LocalizeResources EZpvd() {
        return (LocalizeResources) this.OLrzqt.getValue();
    }

    public static final LocalizeResources AEQbTJ(android.content.Context context) {
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        android.content.res.Configuration configuration2 = context.getApplicationContext().getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        configuration.setLocales(configuration2.getLocales());
        android.content.res.Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        android.content.res.AssetManager assets = context.getApplicationContext().getAssets();
        Intrinsics.copydefault(assets);
        return new LocalizeResources(assets, resources);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return EZpvd();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context createConfigurationContext(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.createConfigurationContext(configuration);
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context createDisplayContext(@NotNull android.view.Display display) {
        Intrinsics.checkNotNullParameter(display, "");
        super.createDisplayContext(display);
        return this;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
