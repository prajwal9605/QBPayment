package com.intuit.qbpayment.service;

import com.intuit.qbpayment.dto.ProfileRequestDto;

/**
 * @author prajwal.kulkarni on 20/09/21
 */
public interface UserProfileService {

    boolean validateUpdate(ProfileRequestDto profileRequestDto);
}
