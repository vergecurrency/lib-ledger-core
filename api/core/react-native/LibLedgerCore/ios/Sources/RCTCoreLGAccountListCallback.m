// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#import "RCTCoreLGAccountListCallback.h"


@implementation RCTCoreLGAccountListCallback
//Export module
RCT_EXPORT_MODULE(RCTCoreLGAccountListCallback)

-(instancetype)init
{
    self = [super init];
    //Init Objc implementation
    if(self)
    {
        self.objcImpl = [[LGAccountListCallbackImpl alloc] init];
    }
    return self;
}

/**
 * Method triggered when main task complete
 * @params result optional of type list<T>, non null if main task failed
 * @params error optional of type Error, non null if main task succeeded
 */
RCT_REMAP_METHOD(onCallback,onCallback:(nullable NSArray<LGAccount *> *)result
                                 error:(nullable LGError *)error) {

    [self.objcImpl onCallback:result error:error];
}
@end