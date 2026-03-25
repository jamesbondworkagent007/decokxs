package com.reown.android.internal.common.explorer;

import android.net.Uri;
import com.reown.android.internal.common.explorer.data.model.App;
import com.reown.android.internal.common.explorer.data.model.Colors;
import com.reown.android.internal.common.explorer.data.model.DappListings;
import com.reown.android.internal.common.explorer.data.model.Desktop;
import com.reown.android.internal.common.explorer.data.model.ImageUrl;
import com.reown.android.internal.common.explorer.data.model.Injected;
import com.reown.android.internal.common.explorer.data.model.Listing;
import com.reown.android.internal.common.explorer.data.model.Metadata;
import com.reown.android.internal.common.explorer.data.model.Mobile;
import com.reown.android.internal.common.explorer.data.model.NotificationType;
import com.reown.android.internal.common.explorer.data.model.NotifyConfig;
import com.reown.android.internal.common.explorer.data.model.Project;
import com.reown.android.internal.common.explorer.data.model.ProjectListing;
import com.reown.android.internal.common.explorer.data.model.SupportedStandard;
import com.reown.android.internal.common.explorer.data.network.ExplorerService;
import com.reown.android.internal.common.explorer.data.network.model.AppDTO;
import com.reown.android.internal.common.explorer.data.network.model.ColorsDTO;
import com.reown.android.internal.common.explorer.data.network.model.DappListingsDTO;
import com.reown.android.internal.common.explorer.data.network.model.DesktopDTO;
import com.reown.android.internal.common.explorer.data.network.model.ImageUrlDTO;
import com.reown.android.internal.common.explorer.data.network.model.InjectedDTO;
import com.reown.android.internal.common.explorer.data.network.model.ListingDTO;
import com.reown.android.internal.common.explorer.data.network.model.MetadataDTO;
import com.reown.android.internal.common.explorer.data.network.model.MobileDTO;
import com.reown.android.internal.common.explorer.data.network.model.NotificationTypeDTO;
import com.reown.android.internal.common.explorer.data.network.model.NotifyConfigDTO;
import com.reown.android.internal.common.explorer.data.network.model.NotifyConfigDataDTO;
import com.reown.android.internal.common.explorer.data.network.model.ProjectDTO;
import com.reown.android.internal.common.explorer.data.network.model.ProjectListingDTO;
import com.reown.android.internal.common.explorer.data.network.model.SupportedStandardDTO;
import com.reown.android.internal.common.model.ProjectId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final class ExplorerRepository {
    public final ExplorerService explorerService;
    public final ProjectId projectId;

    /* JADX INFO: renamed from: com.reown.android.internal.common.explorer.ExplorerRepository$getAllDapps$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExplorerRepository.this.getAllDapps(this);
        }
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.explorer.ExplorerRepository$getNotifyConfig$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17651 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17651(Continuation<? super C17651> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExplorerRepository.this.getNotifyConfig(null, this);
        }
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.explorer.ExplorerRepository$getProjects$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17661 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17661(Continuation<? super C17661> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExplorerRepository.this.getProjects(0, 0, false, false, this);
        }
    }

    public ExplorerRepository(@NotNull ExplorerService explorerService, @NotNull ProjectId projectId) {
        Intrinsics.checkNotNullParameter(explorerService, "");
        Intrinsics.checkNotNullParameter(projectId, "");
        this.explorerService = explorerService;
        this.projectId = projectId;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAllDapps(@NotNull Continuation<? super DappListings> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ExplorerRepository explorerRepository;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object allDapps = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(allDapps);
            ExplorerService explorerService = this.explorerService;
            String value = this.projectId.getValue();
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            allDapps = explorerService.getAllDapps(value, anonymousClass1);
            if (allDapps == objCopydefault) {
                return objCopydefault;
            }
            explorerRepository = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            explorerRepository = (ExplorerRepository) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(allDapps);
        }
        Response response = (Response) allDapps;
        if (response.isSuccessful() && response.body() != null) {
            Object objBody = response.body();
            Intrinsics.copydefault(objBody);
            return explorerRepository.toDappListing((DappListingsDTO) objBody);
        }
        ResponseBody responseBodyErrorBody = response.errorBody();
        throw new Throwable(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getProjects(int i, int i2, boolean z, boolean z2, @NotNull Continuation<? super ProjectListing> continuation) throws Throwable {
        C17661 c17661;
        ExplorerRepository explorerRepository;
        if (continuation instanceof C17661) {
            c17661 = (C17661) continuation;
            int i3 = c17661.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c17661.label = i3 - Integer.MIN_VALUE;
            } else {
                c17661 = new C17661(continuation);
            }
        }
        C17661 c176612 = c17661;
        Object projects = c176612.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = c176612.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(projects);
            ExplorerService explorerService = this.explorerService;
            String value = this.projectId.getValue();
            c176612.L$0 = this;
            c176612.label = 1;
            projects = explorerService.getProjects(value, i2, i, z, z2, c176612);
            if (projects == objCopydefault) {
                return objCopydefault;
            }
            explorerRepository = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            explorerRepository = (ExplorerRepository) c176612.L$0;
            C56391yDq.AEQbTJ(projects);
        }
        Response response = (Response) projects;
        if (response.isSuccessful() && response.body() != null) {
            Object objBody = response.body();
            Intrinsics.copydefault(objBody);
            return explorerRepository.toProjectListing((ProjectListingDTO) objBody);
        }
        ResponseBody responseBodyErrorBody = response.errorBody();
        throw new Throwable(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getNotifyConfig(@NotNull String str, @NotNull Continuation<? super NotifyConfig> continuation) throws Throwable {
        C17651 c17651;
        ExplorerRepository explorerRepository;
        if (continuation instanceof C17651) {
            c17651 = (C17651) continuation;
            int i = c17651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17651.label = i - Integer.MIN_VALUE;
            } else {
                c17651 = new C17651(continuation);
            }
        }
        Object notifyConfig = c17651.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c17651.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(notifyConfig);
            ExplorerService explorerService = this.explorerService;
            String value = this.projectId.getValue();
            c17651.L$0 = this;
            c17651.label = 1;
            notifyConfig = explorerService.getNotifyConfig(value, str, c17651);
            if (notifyConfig == objCopydefault) {
                return objCopydefault;
            }
            explorerRepository = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            explorerRepository = (ExplorerRepository) c17651.L$0;
            C56391yDq.AEQbTJ(notifyConfig);
        }
        Response response = (Response) notifyConfig;
        if (response.isSuccessful() && response.body() != null) {
            Object objBody = response.body();
            Intrinsics.copydefault(objBody);
            return explorerRepository.toNotifyConfig((NotifyConfigDTO) objBody);
        }
        ResponseBody responseBodyErrorBody = response.errorBody();
        throw new Throwable(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
    }

    public final NotifyConfig toNotifyConfig(NotifyConfigDTO notifyConfigDTO) {
        NotifyConfigDataDTO data = notifyConfigDTO.getData();
        List<NotificationTypeDTO> notificationTypes = data.getNotificationTypes();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(notificationTypes, 10));
        Iterator<T> it = notificationTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(toNotificationType((NotificationTypeDTO) it.next()));
        }
        String name = data.getName();
        String description = data.getDescription();
        ImageUrlDTO imageUrl = data.getImageUrl();
        ImageUrl imageUrl2 = imageUrl != null ? toImageUrl(imageUrl) : null;
        String homepage = data.getHomepage();
        if (homepage == null) {
            homepage = "";
        }
        return new NotifyConfig(data.getDappUrl(), name, homepage, description, arrayList, imageUrl2, data.isVerified());
    }

    public final NotificationType toNotificationType(NotificationTypeDTO notificationTypeDTO) {
        String name = notificationTypeDTO.getName();
        String id = notificationTypeDTO.getId();
        String description = notificationTypeDTO.getDescription();
        ImageUrlDTO imageUrl = notificationTypeDTO.getImageUrl();
        return new NotificationType(name, id, description, imageUrl != null ? toImageUrl(imageUrl) : null);
    }

    public final ProjectListing toProjectListing(ProjectListingDTO projectListingDTO) {
        Collection<ProjectDTO> collectionValues = projectListingDTO.getProjects().values();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(toProject((ProjectDTO) it.next()));
        }
        return new ProjectListing(arrayList, projectListingDTO.getCount());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Project toProject(ProjectDTO projectDTO) {
        ImageUrl imageUrl;
        String str;
        String id = projectDTO.getId();
        String name = projectDTO.getName();
        if (name == null) {
            name = "Name not provided";
        } else {
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) name))) {
                name = null;
            }
            if (name == null) {
            }
        }
        String str2 = name;
        String description = projectDTO.getDescription();
        if (description == null) {
            description = "Description not provided";
        } else {
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) description))) {
                description = null;
            }
            if (description == null) {
            }
        }
        String str3 = description;
        String homepage = projectDTO.getHomepage();
        if (homepage == null) {
            homepage = "Homepage not provided";
        } else {
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) homepage))) {
                homepage = null;
            }
            if (homepage == null) {
            }
        }
        String str4 = homepage;
        String imageId = projectDTO.getImageId();
        if (imageId == null) {
            imageId = "ImageID not provided";
        } else {
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) imageId))) {
                imageId = null;
            }
            if (imageId == null) {
            }
        }
        String str5 = imageId;
        ImageUrlDTO imageUrl2 = projectDTO.getImageUrl();
        if (imageUrl2 == null || (imageUrl = toImageUrl(imageUrl2)) == null) {
            imageUrl = new ImageUrl("", "", "");
        }
        ImageUrl imageUrl3 = imageUrl;
        String dappUrl = projectDTO.getDappUrl();
        if (dappUrl == null) {
            str = "Dapp url not provided";
        } else {
            String str6 = StringsKt__StringsKt.fARcdN((CharSequence) dappUrl) ^ true ? dappUrl : null;
            if (str6 != null) {
                str = str6;
            }
        }
        return new Project(id, str2, str4, str5, str3, imageUrl3, str, projectDTO.getOrder());
    }

    public final DappListings toDappListing(DappListingsDTO dappListingsDTO) {
        Collection<ListingDTO> collectionValues = dappListingsDTO.getListings().values();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(toListing((ListingDTO) it.next()));
        }
        return new DappListings(arrayList, dappListingsDTO.getCount(), dappListingsDTO.getTotal());
    }

    public final Listing toListing(ListingDTO listingDTO) {
        ArrayList arrayList;
        String id = listingDTO.getId();
        String name = listingDTO.getName();
        String description = listingDTO.getDescription();
        Uri uri = Uri.parse(listingDTO.getHomepage());
        Intrinsics.checkNotNullExpressionValue(uri, "");
        List<String> chains = listingDTO.getChains();
        List<String> versions = listingDTO.getVersions();
        List<String> sdks = listingDTO.getSdks();
        String appType = listingDTO.getAppType();
        String imageId = listingDTO.getImageId();
        ImageUrl imageUrl = toImageUrl(listingDTO.getImageUrl());
        App app2 = toApp(listingDTO.getApp());
        List<InjectedDTO> injected = listingDTO.getInjected();
        if (injected != null) {
            arrayList = new ArrayList(C56403yEb.AYXKKw(injected, 10));
            Iterator<T> it = injected.iterator();
            while (it.hasNext()) {
                arrayList.add(toInjected((InjectedDTO) it.next()));
            }
        } else {
            arrayList = null;
        }
        Mobile mobile = toMobile(listingDTO.getMobile());
        Desktop desktop = toDesktop(listingDTO.getDesktop());
        List<SupportedStandardDTO> supportedStandards = listingDTO.getSupportedStandards();
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(supportedStandards, 10));
        Iterator<T> it2 = supportedStandards.iterator();
        while (it2.hasNext()) {
            arrayList2.add(toSupportedStandard((SupportedStandardDTO) it2.next()));
        }
        return new Listing(id, name, description, uri, chains, versions, sdks, appType, imageId, imageUrl, app2, arrayList, mobile, desktop, arrayList2, toMetadata(listingDTO.getMetadata()), listingDTO.getUpdatedAt());
    }

    public final ImageUrl toImageUrl(ImageUrlDTO imageUrlDTO) {
        return new ImageUrl(imageUrlDTO.getSm(), imageUrlDTO.getMd(), imageUrlDTO.getLg());
    }

    public final App toApp(AppDTO appDTO) {
        return new App(appDTO.getBrowser(), appDTO.getIos(), appDTO.getAndroid(), appDTO.getMac(), appDTO.getWindows(), appDTO.getLinux(), appDTO.getChrome(), appDTO.getFirefox(), appDTO.getSafari(), appDTO.getEdge(), appDTO.getOpera());
    }

    public final Injected toInjected(InjectedDTO injectedDTO) {
        return new Injected(injectedDTO.getNamespace(), injectedDTO.getInjectedId());
    }

    public final Mobile toMobile(MobileDTO mobileDTO) {
        return new Mobile(mobileDTO.getNative(), mobileDTO.getUniversal());
    }

    public final Desktop toDesktop(DesktopDTO desktopDTO) {
        return new Desktop(desktopDTO.getNative(), desktopDTO.getUniversal());
    }

    public final SupportedStandard toSupportedStandard(SupportedStandardDTO supportedStandardDTO) {
        return new SupportedStandard(supportedStandardDTO.getId(), supportedStandardDTO.getUrl(), supportedStandardDTO.getTitle(), supportedStandardDTO.getStandardId(), supportedStandardDTO.getStandardPrefix());
    }

    public final Metadata toMetadata(MetadataDTO metadataDTO) {
        return new Metadata(metadataDTO.getShortName(), toColors(metadataDTO.getColors()));
    }

    public final Colors toColors(ColorsDTO colorsDTO) {
        return new Colors(colorsDTO.getPrimary(), colorsDTO.getSecondary());
    }
}
