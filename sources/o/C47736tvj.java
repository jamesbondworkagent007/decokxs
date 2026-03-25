package o;

import android.widget.FrameLayout;
import com.okinc.okapm.okqpl.util.QPLConstants;
import com.okinc.planet.domain.remote.dto.PublishPermissionResp;
import com.okinc.planet_api.PluginShareToFeedConfig;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tvj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47736tvj {
    public final InterfaceC46387tSl AEQbTJ;
    public Function2<? super PlanetPublisherPluginType, ? super android.view.View, Unit> EZpvd;
    public final C47732tvf KWHzl;
    public Function2<? super tWV, ? super PlanetPublisherPluginType, Unit> OLrzqt;
    public Function1<? super java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ() {
        this.OLrzqt = null;
        this.copydefault = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function2<? super tWV, ? super PlanetPublisherPluginType, Unit> function2, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function2;
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.EZpvd = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function2<? super PlanetPublisherPluginType, ? super android.view.View, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = function2;
    }

    public C47736tvj(@NotNull InterfaceC46387tSl interfaceC46387tSl, @NotNull C47732tvf c47732tvf) {
        Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
        Intrinsics.checkNotNullParameter(c47732tvf, "");
        this.AEQbTJ = interfaceC46387tSl;
        this.KWHzl = c47732tvf;
    }

    public static final Unit copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.copydefault("PlanetPluginDispatcher", "Plugin error: " + str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tvj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setConvertResultCallbacks$default(C47736tvj c47736tvj, Function2 function2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.tvh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C47736tvj.copydefault((java.lang.String) obj2);
                }
            };
        }
        c47736tvj.AEQbTJ(function2, function1);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull PlanetPublisherPluginType planetPublisherPluginType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        try {
            pUU.EZpvd("PlanetPluginDispatcher", "Handling plugin new for type: " + planetPublisherPluginType);
            tWX twxCopydefault = this.KWHzl.copydefault(planetPublisherPluginType);
            if (twxCopydefault != null) {
                pUU.EZpvd("PlanetPluginDispatcher", "Found plugin register for new: " + planetPublisherPluginType);
                twxCopydefault.OLrzqt(context, fragmentManager, new ActionBar(planetPublisherPluginType, this, context));
            } else {
                java.lang.String str = "No plugin register found for new type: " + planetPublisherPluginType;
                pUU.valueOf("PlanetPluginDispatcher", str);
                Function1<? super java.lang.String, Unit> function1 = this.copydefault;
                if (function1 != null) {
                    function1.invoke(str);
                }
            }
        } catch (java.lang.Exception e) {
            java.lang.String str2 = "Failed to handle plugin new: " + e.getMessage();
            pUU.AEQbTJ("PlanetPluginDispatcher", str2, e);
            Function1<? super java.lang.String, Unit> function12 = this.copydefault;
            if (function12 != null) {
                function12.invoke(str2);
            }
        }
    }

    /* JADX INFO: renamed from: o.tvj$ActionBar */
    public static final class ActionBar extends tWW {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ C47736tvj EZpvd;
        public final /* synthetic */ PlanetPublisherPluginType OLrzqt;

        public ActionBar(PlanetPublisherPluginType planetPublisherPluginType, C47736tvj c47736tvj, android.content.Context context) {
            this.OLrzqt = planetPublisherPluginType;
            this.EZpvd = c47736tvj;
            this.AEQbTJ = context;
        }

        @Override // o.tWW
        public void copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("PlanetPluginDispatcher", "Plugin new successful: " + this.OLrzqt);
            this.EZpvd.copydefault(this.AEQbTJ, this.OLrzqt, str);
        }

        @Override // o.tWW
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.copydefault("PlanetPluginDispatcher", "Plugin new failed: " + str);
            Function1 function1 = this.EZpvd.copydefault;
            if (function1 != null) {
                function1.invoke(str);
            }
        }
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull PlanetPublisherPluginType planetPublisherPluginType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            pUU.EZpvd("PlanetPluginDispatcher", "Handling plugin edit for type: " + planetPublisherPluginType);
            tWX twxCopydefault = this.KWHzl.copydefault(planetPublisherPluginType);
            if (twxCopydefault != null) {
                pUU.EZpvd("PlanetPluginDispatcher", "Found plugin register for edit: " + planetPublisherPluginType);
                twxCopydefault.KWHzl(context, fragmentManager, str, new StateListAnimator(planetPublisherPluginType, this, context));
            } else {
                java.lang.String str2 = "No plugin register found for edit type: " + planetPublisherPluginType;
                pUU.valueOf("PlanetPluginDispatcher", str2);
                Function1<? super java.lang.String, Unit> function1 = this.copydefault;
                if (function1 != null) {
                    function1.invoke(str2);
                }
            }
        } catch (java.lang.Exception e) {
            java.lang.String str3 = "Failed to handle plugin edit: " + e.getMessage();
            pUU.AEQbTJ("PlanetPluginDispatcher", str3, e);
            Function1<? super java.lang.String, Unit> function12 = this.copydefault;
            if (function12 != null) {
                function12.invoke(str3);
            }
        }
    }

    /* JADX INFO: renamed from: o.tvj$StateListAnimator */
    public static final class StateListAnimator extends tWW {
        public final /* synthetic */ C47736tvj KWHzl;
        public final /* synthetic */ PlanetPublisherPluginType OLrzqt;
        public final /* synthetic */ android.content.Context copydefault;

        public StateListAnimator(PlanetPublisherPluginType planetPublisherPluginType, C47736tvj c47736tvj, android.content.Context context) {
            this.OLrzqt = planetPublisherPluginType;
            this.KWHzl = c47736tvj;
            this.copydefault = context;
        }

        @Override // o.tWW
        public void copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("PlanetPluginDispatcher", "Plugin edit successful: " + this.OLrzqt);
            this.KWHzl.copydefault(this.copydefault, this.OLrzqt, str);
        }

        @Override // o.tWW
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.copydefault("PlanetPluginDispatcher", "Plugin edit failed: " + str);
            Function1 function1 = this.KWHzl.copydefault;
            if (function1 != null) {
                function1.invoke(str);
            }
        }
    }

    public final void OLrzqt(@NotNull PlanetPublisherPluginType planetPublisherPluginType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            pUU.EZpvd("PlanetPluginDispatcher", "Handling plugin delete for type: " + planetPublisherPluginType);
            tWX twxCopydefault = this.KWHzl.copydefault(planetPublisherPluginType);
            if (twxCopydefault != null) {
                pUU.EZpvd("PlanetPluginDispatcher", "Found plugin register for delete: " + planetPublisherPluginType);
                twxCopydefault.AEQbTJ(str);
                pUU.KWHzl("PlanetPluginDispatcher", "Plugin delete successful: " + planetPublisherPluginType);
            } else {
                java.lang.String str2 = "No plugin register found for delete type: " + planetPublisherPluginType;
                pUU.valueOf("PlanetPluginDispatcher", str2);
                Function1<? super java.lang.String, Unit> function1 = this.copydefault;
                if (function1 != null) {
                    function1.invoke(str2);
                }
            }
        } catch (java.lang.Exception e) {
            java.lang.String str3 = "Failed to handle plugin delete: " + e.getMessage();
            pUU.AEQbTJ("PlanetPluginDispatcher", str3, e);
            Function1<? super java.lang.String, Unit> function12 = this.copydefault;
            if (function12 != null) {
                function12.invoke(str3);
            }
        }
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull PlanetPublisherPluginType planetPublisherPluginType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        try {
            pUU.EZpvd("PlanetPluginDispatcher", "Handling plugin shortcut for type: " + planetPublisherPluginType);
            tWX twxCopydefault = this.KWHzl.copydefault(planetPublisherPluginType);
            if (twxCopydefault != null) {
                pUU.EZpvd("PlanetPluginDispatcher", "Found plugin register for shortcut: " + planetPublisherPluginType);
                twxCopydefault.EZpvd(context, fragmentManager, new Application(planetPublisherPluginType, this, context, fragmentManager));
            } else {
                java.lang.String str = "No plugin register found for shortcut type: " + planetPublisherPluginType;
                pUU.valueOf("PlanetPluginDispatcher", str);
                Function1<? super java.lang.String, Unit> function1 = this.copydefault;
                if (function1 != null) {
                    function1.invoke(str);
                }
            }
        } catch (java.lang.Exception e) {
            java.lang.String str2 = "Failed to handle plugin shortcut: " + e.getMessage();
            pUU.AEQbTJ("PlanetPluginDispatcher", str2, e);
            Function1<? super java.lang.String, Unit> function12 = this.copydefault;
            if (function12 != null) {
                function12.invoke(str2);
            }
        }
    }

    /* JADX INFO: renamed from: o.tvj$Application */
    public static final class Application extends tWU {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ PlanetPublisherPluginType KWHzl;
        public final /* synthetic */ androidx.fragment.app.FragmentManager OLrzqt;
        public final /* synthetic */ C47736tvj copydefault;

        public Application(PlanetPublisherPluginType planetPublisherPluginType, C47736tvj c47736tvj, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager) {
            this.KWHzl = planetPublisherPluginType;
            this.copydefault = c47736tvj;
            this.AEQbTJ = context;
            this.OLrzqt = fragmentManager;
        }

        @Override // o.tWU
        public void AEQbTJ(androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "");
            pUU.EZpvd("PlanetPluginDispatcher", "Shortcut fragment received for plugin: " + this.KWHzl);
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.AEQbTJ);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            frameLayout.setId(android.view.View.generateViewId());
            this.OLrzqt.beginTransaction().replace(frameLayout.getId(), fragment).commit();
            Function2 function2 = this.copydefault.EZpvd;
            if (function2 != null) {
                function2.invoke(this.KWHzl, frameLayout);
            }
        }

        @Override // o.tWU
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.EZpvd("PlanetPluginDispatcher", "Plugin shortcut success: " + this.KWHzl);
            this.copydefault.copydefault(this.AEQbTJ, this.KWHzl, str);
        }

        @Override // o.tWU
        public void copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.valueOf("PlanetPluginDispatcher", "Plugin shortcut error: " + this.KWHzl + ", error: " + str);
            Function1 function1 = this.copydefault.copydefault;
            if (function1 != null) {
                function1.invoke(str);
            }
        }
    }

    public final java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull PlanetPublisherPluginType planetPublisherPluginType, @NotNull java.lang.String str, @NotNull PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginPreviewType, "");
        try {
            pUU.EZpvd("PlanetPluginDispatcher", "Generating plugin view with pluginType: " + planetPublisherPluginType + ", previewType: " + planetPublisherPluginPreviewType);
            tWX twxCopydefault = this.KWHzl.copydefault(planetPublisherPluginType);
            if (twxCopydefault == null) {
                java.lang.String str2 = "No plugin register found for type: " + planetPublisherPluginType;
                pUU.copydefault("PlanetPluginDispatcher", str2);
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalArgumentException(str2)));
            }
            java.lang.Object objCopydefault = twxCopydefault.copydefault(context, str, planetPublisherPluginPreviewType);
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
            if (thM7380exceptionOrNullimpl == null) {
                pUU.EZpvd("PlanetPluginDispatcher", "Plugin view generation success");
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl((tWV) objCopydefault);
            }
            pUU.AEQbTJ("PlanetPluginDispatcher", "Plugin view generation failed", thM7380exceptionOrNullimpl);
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("PlanetPluginDispatcher", "Failed to generate plugin view: " + e.getMessage(), e);
            Result.Application application4 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
    }

    public final void copydefault(android.content.Context context, PlanetPublisherPluginType planetPublisherPluginType, java.lang.String str) {
        try {
            pUU.EZpvd("PlanetPluginDispatcher", "Regenerating plugin view for type: " + planetPublisherPluginType);
            tWX twxCopydefault = this.KWHzl.copydefault(planetPublisherPluginType);
            if (twxCopydefault != null) {
                java.lang.Object objCopydefault = twxCopydefault.copydefault(context, str, PlanetPublisherPluginPreviewType.PUBLISHER);
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl == null) {
                    tWV twv = (tWV) objCopydefault;
                    pUU.EZpvd("PlanetPluginDispatcher", "Plugin regenerate success with data: " + twv);
                    Function2<? super tWV, ? super PlanetPublisherPluginType, Unit> function2 = this.OLrzqt;
                    if (function2 != null) {
                        function2.invoke(twv, planetPublisherPluginType);
                    }
                } else {
                    java.lang.String str2 = "Plugin regenerate error: " + thM7380exceptionOrNullimpl.getMessage();
                    pUU.AEQbTJ("PlanetPluginDispatcher", str2, thM7380exceptionOrNullimpl);
                    Function1<? super java.lang.String, Unit> function1 = this.copydefault;
                    if (function1 != null) {
                        function1.invoke(str2);
                    }
                }
            } else {
                java.lang.String str3 = "No plugin register found for regenerate type: " + planetPublisherPluginType;
                pUU.valueOf("PlanetPluginDispatcher", str3);
                Function1<? super java.lang.String, Unit> function12 = this.copydefault;
                if (function12 != null) {
                    function12.invoke(str3);
                }
            }
        } catch (java.lang.Exception e) {
            java.lang.String str4 = "Failed to regenerate plugin view: " + e.getMessage();
            pUU.AEQbTJ("PlanetPluginDispatcher", str4, e);
            Function1<? super java.lang.String, Unit> function13 = this.copydefault;
            if (function13 != null) {
                function13.invoke(str4);
            }
        }
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull PluginShareToFeedConfig pluginShareToFeedConfig) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(pluginShareToFeedConfig, "");
        try {
            pUU.EZpvd("PlanetPluginDispatcher", "Handling plugin data: " + pluginShareToFeedConfig.getPluginType());
            tWX twxCopydefault = this.KWHzl.copydefault(pluginShareToFeedConfig.getPluginType());
            if (twxCopydefault != null) {
                pUU.EZpvd("PlanetPluginDispatcher", "Found plugin register for type: " + pluginShareToFeedConfig.getPluginType());
                java.lang.Object objCopydefault = twxCopydefault.copydefault(context, pluginShareToFeedConfig.getMetaData(), PlanetPublisherPluginPreviewType.PUBLISHER);
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl == null) {
                    tWV twv = (tWV) objCopydefault;
                    pUU.EZpvd("PlanetPluginDispatcher", "Plugin convert success with data: " + twv);
                    Function2<? super tWV, ? super PlanetPublisherPluginType, Unit> function2 = this.OLrzqt;
                    if (function2 != null) {
                        function2.invoke(twv, pluginShareToFeedConfig.getPluginType());
                    }
                } else {
                    java.lang.String str = "Plugin convert error: " + thM7380exceptionOrNullimpl.getMessage();
                    pUU.AEQbTJ("PlanetPluginDispatcher", str, thM7380exceptionOrNullimpl);
                    Function1<? super java.lang.String, Unit> function1 = this.copydefault;
                    if (function1 != null) {
                        function1.invoke(str);
                    }
                }
            } else {
                java.lang.String str2 = "No plugin register found for type: " + pluginShareToFeedConfig.getPluginType();
                pUU.valueOf("PlanetPluginDispatcher", str2);
                Function1<? super java.lang.String, Unit> function12 = this.copydefault;
                if (function12 != null) {
                    function12.invoke(str2);
                }
            }
        } catch (java.lang.Exception e) {
            java.lang.String str3 = "Failed to handle plugin data: " + e.getMessage();
            pUU.AEQbTJ("PlanetPluginDispatcher", str3, e);
            Function1<? super java.lang.String, Unit> function13 = this.copydefault;
            if (function13 != null) {
                function13.invoke(str3);
            }
        }
    }

    public static /* synthetic */ java.util.List getShortcutSupportedPlugins$default(C47736tvj c47736tvj, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c47736tvj.AEQbTJ(z);
    }

    public final java.util.List<tWX> AEQbTJ(boolean z) {
        java.util.List<tWX> listEZpvd = EZpvd(z);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listEZpvd) {
            if (((tWX) obj).KWHzl()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ java.util.List getAllRegisteredPlugins$default(C47736tvj c47736tvj, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c47736tvj.EZpvd(z);
    }

    public final java.util.List<tWX> EZpvd(boolean z) {
        java.lang.Object next;
        java.util.List<tWX> listOLrzqt = this.KWHzl.OLrzqt(z);
        PublishPermissionResp publishPermissionRespKWHzl = this.AEQbTJ.KWHzl();
        java.util.List<java.lang.String> pluginConfig = publishPermissionRespKWHzl != null ? publishPermissionRespKWHzl.getPluginConfig() : null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOLrzqt) {
            tWX twx = (tWX) obj;
            if (twx.OLrzqt() && C47727tva.EZpvd.KWHzl(twx.EZpvd())) {
                arrayList.add(obj);
            }
        }
        pUU.EZpvd("PlanetPluginDispatcher", "Using backend pluginConfig: " + pluginConfig);
        java.util.ArrayList<tWX> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            java.lang.String value = ((tWX) obj2).EZpvd().getValue();
            java.lang.String lowerCase = value.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if ((C59449zhJ.startsWith$default(lowerCase, QPLConstants.ENV_DEBUG, false, 2, null) && z) || (pluginConfig != null && pluginConfig.contains(value))) {
                arrayList2.add(obj2);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (pluginConfig != null) {
            for (java.lang.String str : pluginConfig) {
                java.util.Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((tWX) next).EZpvd().getValue(), (java.lang.Object) str)) {
                        break;
                    }
                }
                tWX twx2 = (tWX) next;
                if (twx2 != null) {
                    arrayList3.add(twx2);
                }
            }
        }
        for (tWX twx3 : arrayList2) {
            if (!arrayList3.contains(twx3)) {
                arrayList3.add(twx3);
            }
        }
        return arrayList3;
    }
}
