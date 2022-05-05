package com.mrdave19.strava.authorization.token.repository;

import com.mrdave19.strava.authorization.token.entity.StravaRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StravaRefreshTokenRepository extends JpaRepository<StravaRefreshToken,Long> {
}
